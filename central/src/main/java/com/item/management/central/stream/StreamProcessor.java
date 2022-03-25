package com.item.management.central.stream;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StreamProcessor {
    
    @Value(value = "${spring.kafka.topic.request}")
    private String topicRequest;
    
    @Value(value = "${spring.kafka.topic.check}")
    private String topicCheck;

    @Autowired
    void buildPipeline(StreamsBuilder streamsBuilder) {
        KStream<String, String> messageStream = streamsBuilder
          .stream(topicRequest);
        messageStream.to(topicCheck);
        
    }
}