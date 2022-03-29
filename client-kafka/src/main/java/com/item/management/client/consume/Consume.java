package com.item.management.client.consume;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.protobuf.AbstractMessage.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.item.management.client.service.CheckAvailableClientService;
import com.item.management.client.service.CheckAvailableRequest;
import com.item.management.client.service.CheckAvailableRequestResponse;
import com.item.management.client.service.CheckAvailableServiceGrpc;
import com.item.management.client.service.UpdateStockRequest;
import com.item.management.client.service.UpdateStockServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class Consume {
	
	@Autowired
	CheckAvailableClientService checkAvailableClientService;
	
	@Value(value = "${grpc_connect_port}")
    private String port;	
	
	@Value(value = "${office_id}")
    private String officeId;

    @KafkaListener(topics = "${spring.kafka.topic.transfer}")
    public void receiveTransferOrder(ConsumerRecord<?, ?> consumerRecord) {
    	System.out.println("consume transfer" + consumerRecord.value().toString());
    	HashMap req = null;
		try {
			req = new ObjectMapper().readValue(consumerRecord.value().toString(), HashMap.class);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		if(req.get("snid")==null||req.get("snid").toString().equalsIgnoreCase("")||req.get("requestid")==null||req.get("sourceoffice")==null) {
			return;
		}
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", Integer.parseInt(port))
                .usePlaintext()
                .build();
		String snId = req.get("snid").toString().replaceAll("[\\[\\]]", "");
		snId = snId.replaceAll(" ", "");
		String[] arrSnId = snId.split(",");
		List<String> finalSn = new ArrayList<>();
		for(String sn: arrSnId) {
			finalSn.add(req.get("itemid").toString()+"-"+sn);
		}
		UpdateStockServiceGrpc.UpdateStockServiceBlockingStub stub = UpdateStockServiceGrpc.newBlockingStub(channel);
		if(officeId.equalsIgnoreCase(req.get("sourceoffice").toString())) {
			stub.updateStock(UpdateStockRequest.newBuilder()
					.setOfficeId(req.get("sourceoffice").toString())
					.setType(1)
					.addAllSerialNumbers(finalSn).build()
					);
		}else if(officeId.equalsIgnoreCase(req.get("requestid").toString().split("-")[0])){
		
			stub.updateStock(UpdateStockRequest.newBuilder()
					.setOfficeId(req.get("requestid").toString().split("-")[0])
					.setType(2)
					.addAllSerialNumbers(finalSn).build()
					);
		}
        /*CheckAvailableServiceGrpc.CheckAvailableServiceBlockingStub stub
                = CheckAvailableServiceGrpc.newBlockingStub(channel);
        CheckAvailableRequestResponse response = stub.checkAR(CheckAvailableRequest.newBuilder()
                .setItemId(req.getItemId())
                .setRequestId(req.getRequestId())
                .setOfficeId(req.getOfficeId())
                .setTotal(req.getTotal())
                .build());*/
    }
	
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