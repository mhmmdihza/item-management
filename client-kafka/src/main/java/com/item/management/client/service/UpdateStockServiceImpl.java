package com.item.management.client.service;

import com.item.management.client.service.UpdateStockServiceGrpc.UpdateStockServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UpdateStockServiceImpl extends UpdateStockServiceImplBase {
	@Override
	public void updateStock(UpdateStockRequest request , StreamObserver<UpdateStockResponse> responseObserver){
		
	}
}