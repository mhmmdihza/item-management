package com.item.management.client.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.item.management.client.StockRepo;
import com.item.management.client.entity.Stock;
import com.item.management.client.service.CheckAvailableRequestResponse.Builder;
import com.item.management.client.service.CheckAvailableServiceGrpc.CheckAvailableServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ClientCheckAvailableServiceImpl extends CheckAvailableServiceImplBase {
    
	@Value(value = "${office_id}")
    private String officeId;
	
	@Autowired
	StockRepo repo;
	
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
    	List<Stock> ls = repo.findByitemid(request.getItemId());
    	List<String> sn =  ls.stream().map(Stock::getSerialNumber).collect(Collectors.toList());       
    	List<String> snFinal = new ArrayList<>();
    	if(ls.size()>=request.getTotal()) {
	    	for(int i = 0; i< request.getTotal(); i++) {
	    		snFinal.add(sn.get(i));
	    	}
    	}
    	Builder builder = CheckAvailableRequestResponse.newBuilder()
        		.setRequestId(request.getRequestId())
                .setTotal(ls.size())
                .setOfficeId(officeId).addAllSerialNumbers(snFinal);
    	CheckAvailableRequestResponse response = builder.build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}