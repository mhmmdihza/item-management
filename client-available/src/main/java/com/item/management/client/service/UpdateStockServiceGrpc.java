package com.item.management.client.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: UpdateStockService.proto")
public final class UpdateStockServiceGrpc {

  private UpdateStockServiceGrpc() {}

  public static final String SERVICE_NAME = "com.item.management.client.service.UpdateStockService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.item.management.client.service.UpdateStockRequest,
      com.item.management.client.service.UpdateStockResponse> METHOD_UPDATE_STOCK =
      io.grpc.MethodDescriptor.<com.item.management.client.service.UpdateStockRequest, com.item.management.client.service.UpdateStockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.item.management.client.service.UpdateStockService", "updateStock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.item.management.client.service.UpdateStockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.item.management.client.service.UpdateStockResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateStockServiceStub newStub(io.grpc.Channel channel) {
    return new UpdateStockServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateStockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateStockServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateStockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateStockServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateStockServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateStock(com.item.management.client.service.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.item.management.client.service.UpdateStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STOCK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UPDATE_STOCK,
            asyncUnaryCall(
              new MethodHandlers<
                com.item.management.client.service.UpdateStockRequest,
                com.item.management.client.service.UpdateStockResponse>(
                  this, METHODID_UPDATE_STOCK)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateStockServiceStub extends io.grpc.stub.AbstractStub<UpdateStockServiceStub> {
    private UpdateStockServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateStockServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateStockServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateStockServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateStock(com.item.management.client.service.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.item.management.client.service.UpdateStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateStockServiceBlockingStub extends io.grpc.stub.AbstractStub<UpdateStockServiceBlockingStub> {
    private UpdateStockServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateStockServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateStockServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateStockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.item.management.client.service.UpdateStockResponse updateStock(com.item.management.client.service.UpdateStockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STOCK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateStockServiceFutureStub extends io.grpc.stub.AbstractStub<UpdateStockServiceFutureStub> {
    private UpdateStockServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateStockServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateStockServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateStockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.item.management.client.service.UpdateStockResponse> updateStock(
        com.item.management.client.service.UpdateStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK, getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_STOCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateStockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateStockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_STOCK:
          serviceImpl.updateStock((com.item.management.client.service.UpdateStockRequest) request,
              (io.grpc.stub.StreamObserver<com.item.management.client.service.UpdateStockResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class UpdateStockServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.item.management.client.service.UpdateStockServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UpdateStockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateStockServiceDescriptorSupplier())
              .addMethod(METHOD_UPDATE_STOCK)
              .build();
        }
      }
    }
    return result;
  }
}
