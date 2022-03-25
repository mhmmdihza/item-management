package com.item.management.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.item.management.client.produce.Produce;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class CheckAvailableClientService {
				
	@Value(value = "${grpc_connect_port}")
    private String port;		
	
	@Autowired
	Produce produce;
	
    public void check(CheckAvailableRequest req) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", Integer.parseInt(port))
                .usePlaintext()
                .build();
        System.out.println("check1");
        CheckAvailableServiceGrpc.CheckAvailableServiceBlockingStub stub
                = CheckAvailableServiceGrpc.newBlockingStub(channel);
        CheckAvailableRequestResponse response = stub.checkAR(CheckAvailableRequest.newBuilder()
                .setItemId(req.getItemId())
                .setRequestId(req.getRequestId())
                .setOfficeId(req.getOfficeId())
                .setTotal(req.getTotal())
                .build());
        System.out.println("check2");
        try {
        	System.out.println("resp"+JsonFormat.printer().print(response));
			produce.send(JsonFormat.printer().print(response));
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        channel.shutdown();
    }

}