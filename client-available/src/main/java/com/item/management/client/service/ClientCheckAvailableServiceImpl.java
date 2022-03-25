package com.item.management.client.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.item.management.client.service.CheckAvailableServiceGrpc.CheckAvailableServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ClientCheckAvailableServiceImpl extends CheckAvailableServiceImplBase {
    
	@Value(value = "${office_id}")
    private String officeId;
	
	@Override
	public void checkAR(
            CheckAvailableRequest request, StreamObserver<CheckAvailableRequestResponse> responseObserver) {
    	
		System.out.println("checks1");
    	if(StringUtils.isEmpty(request.getRequestId())||StringUtils.isEmpty(request.getOfficeId())||StringUtils.isEmpty(request.getItemId())) {
    		CheckAvailableRequestResponse response = CheckAvailableRequestResponse.newBuilder()
                    .setRequestId(request.getRequestId())
                    .setTotal(0)
                    .setOfficeId(officeId)
                    .build();
    		System.out.println("checks2");
    		responseObserver.onNext(response);
            responseObserver.onCompleted();
    	}
    	System.out.println("checks3");
    	if(request.getRequestId().startsWith(officeId)) {
    		CheckAvailableRequestResponse response = CheckAvailableRequestResponse.newBuilder()
                    .setRequestId(request.getRequestId())
                    .setTotal(0)
                    .setOfficeId(officeId)
                    .build();
    		System.out.println("checks222");
    		responseObserver.onNext(response);
            responseObserver.onCompleted();
    	}
    	System.out.println("checks5");
        CheckAvailableRequestResponse response = CheckAvailableRequestResponse.newBuilder()
        		.setRequestId(request.getRequestId())
                .setTotal(120)
                .setOfficeId(officeId)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}