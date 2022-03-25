package com.item.management.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.item.management.client.service.CheckAvailableClientService;

@SpringBootApplication
public class ClientKafkaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ClientKafkaApplication.class, args);
	}

}
