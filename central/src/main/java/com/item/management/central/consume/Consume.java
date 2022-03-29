package com.item.management.central.consume;

import java.util.HashMap;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.item.management.central.Produce.Produce;
import com.item.management.central.entity.LookupItem;
import com.item.management.central.repo.LookupItemRepo;

@Component
public class Consume {
	

	@Autowired
	LookupItemRepo repo;
	
	@Autowired
	Produce produce; 
	
	private int totalOffice = 3;
	
    @KafkaListener(topics = "${spring.kafka.topic.available}")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
    	System.out.println("consume available" + consumerRecord.value().toString());
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
			System.out.println("lssize"+ls.size());
			if(ls.size()>=totalOffice) {
				System.out.println("masuk"+ls.get(0).getQty()+"-"+ls.get(ls.size()-1).getQty());
				System.out.println("masuk2"+ls.get(0).getSourceoffice()+"-"+ls.get(ls.size()-1).getSourceoffice());
				if(!ls.get(0).getSnid().equalsIgnoreCase("")) {
					System.out.println("transfer");
					produce.send(new ObjectMapper().writeValueAsString(ls.get(0)));
				}
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	
    }
}