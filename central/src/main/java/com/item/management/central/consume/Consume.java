package com.item.management.central.consume;

import java.util.HashMap;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.item.management.central.entity.LookupItem;
import com.item.management.central.repo.LookupItemRepo;

@Component
public class Consume {
	

	@Autowired
	LookupItemRepo repo;
	
	private int totalOffice = 3;
	
    @KafkaListener(topics = "${spring.kafka.topic.available}")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
    	//System.out.println("consume available" + consumerRecord.value().toString());
    	try {
			HashMap response = new ObjectMapper().readValue(consumerRecord.value().toString(), HashMap.class);
			LookupItem item = new LookupItem();
			String[] arr = response.get("requestId").toString().split("-");
			item.setRequestid(response.get("requestId").toString());
			item.setSourceoffice(response.get("officeId").toString());
			item.setItemid(arr[1]);
			if(response.get("total")!=null) {
				item.setQty(Integer.parseInt(response.get("total").toString()));
			}else {
				item.setQty(0);
			}
			if(response.get("serialNumbers")!=null) {
				item.setSnid(response.get("serialNumbers").toString());
			}else {
				item.setSnid("");
			}
			repo.save(item);
			List<LookupItem> ls = repo.findbyrequestid(item.getRequestid());
			if(ls.size()+1==totalOffice) {
				if(ls.get(0).getQty()>0) {
					//send(new ObjectMapper().writeValueAsString(ls.get(0)));
				}
			}
		} catch (JsonProcessingException e) {
		}
    	
    }
}