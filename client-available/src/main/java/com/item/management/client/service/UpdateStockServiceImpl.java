package com.item.management.client.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.item.management.client.StockRepo;
import com.item.management.client.entity.Stock;
import com.item.management.client.service.UpdateStockServiceGrpc.UpdateStockServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UpdateStockServiceImpl extends UpdateStockServiceImplBase {
	
	@Autowired
	StockRepo repo;
	
	@Override
	public void updateStock(UpdateStockRequest request , StreamObserver<UpdateStockResponse> responseObserver){
		
		if(request.getType()==1) {
		
			for(String x : request.getSerialNumbersList()) {
				
				Stock st = new Stock();
				String[] arr = x.split("-");
				st.setItemid(arr[0]);
				st.setSerialNumber(arr[1]);
				System.out.println("updatest"+st.getItemid()+"-"+st.getSerialNumber());
				repo.deleteById(st.getSerialNumber());
			}
		}
		
		if(request.getType()==2) {
			for(String x : request.getSerialNumbersList()) {
				Stock st = new Stock();
				String[] arr = x.split("-");
				st.setItemid(arr[0]);
				st.setSerialNumber(arr[1]);
				System.out.println("updatest"+st.getItemid()+"-"+st.getSerialNumber());
				repo.save(st);
			}
			
		}
		
		UpdateStockResponse response = UpdateStockResponse.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
}