package com.item.management.client.consume;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.item.management.client.service.CheckAvailableClientService;
import com.item.management.client.service.CheckAvailableRequest;

@Component
public class Consume {
	
	@Autowired
	CheckAvailableClientService checkAvailableClientService;

    @KafkaListener(topics = "${spring.kafka.topic.check}")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
    	System.out.println("consume" + consumerRecord.value().toString());
        CheckAvailableRequest req = null;
		try {
			req = fromJson(consumerRecord.value().toString(), CheckAvailableRequest.class);
		} catch (IOException e) {
		}
		checkAvailableClientService.check(req);
        
    }
    public <T extends Message> T fromJson(String json, Class<T> clazz) throws IOException {
        Builder builder = null;
        try {
          builder = (Builder) clazz.getMethod("newBuilder").invoke(null);

        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
            | NoSuchMethodException | SecurityException e) {
          return null;
        }
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
        return (T) builder.build();
      }
}