package com.item.management.client.service;

import com.item.management.client.service.CheckAvailableServiceGrpc.CheckAvailableServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ClientCheckAvailableServiceImpl extends CheckAvailableServiceImplBase {
    @Override
    public void checkAR(
            CheckAvailableRequest request, StreamObserver<CheckAvailableRequestResponse> responseObserver) {
        System.out.println("hehemskgrpc"+request.getRequestId()+"-"+request.getOfficeId()+"-"+request.getItemId()+"-"+request.getTotal());

        CheckAvailableRequestResponse response = CheckAvailableRequestResponse.newBuilder()
                .setOfficeId("mantap")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}