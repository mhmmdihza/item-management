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
    comments = "Source: CheckAvailableService.proto")
public final class CheckAvailableServiceGrpc {

  private CheckAvailableServiceGrpc() {}

  public static final String SERVICE_NAME = "com.item.management.client.service.CheckAvailableService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.item.management.client.service.CheckAvailableRequest,
      com.item.management.client.service.CheckAvailableRequestResponse> METHOD_CHECK_AR =
      io.grpc.MethodDescriptor.<com.item.management.client.service.CheckAvailableRequest, com.item.management.client.service.CheckAvailableRequestResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.item.management.client.service.CheckAvailableService", "checkAR"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.item.management.client.service.CheckAvailableRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.item.management.client.service.CheckAvailableRequestResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckAvailableServiceStub newStub(io.grpc.Channel channel) {
    return new CheckAvailableServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckAvailableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckAvailableServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckAvailableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckAvailableServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CheckAvailableServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkAR(com.item.management.client.service.CheckAvailableRequest request,
        io.grpc.stub.StreamObserver<com.item.management.client.service.CheckAvailableRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_AR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CHECK_AR,
            asyncUnaryCall(
              new MethodHandlers<
                com.item.management.client.service.CheckAvailableRequest,
                com.item.management.client.service.CheckAvailableRequestResponse>(
                  this, METHODID_CHECK_AR)))
          .build();
    }
  }

  /**
   */
  public static final class CheckAvailableServiceStub extends io.grpc.stub.AbstractStub<CheckAvailableServiceStub> {
    private CheckAvailableServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckAvailableServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckAvailableServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckAvailableServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkAR(com.item.management.client.service.CheckAvailableRequest request,
        io.grpc.stub.StreamObserver<com.item.management.client.service.CheckAvailableRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_AR, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CheckAvailableServiceBlockingStub extends io.grpc.stub.AbstractStub<CheckAvailableServiceBlockingStub> {
    private CheckAvailableServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckAvailableServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckAvailableServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckAvailableServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.item.management.client.service.CheckAvailableRequestResponse checkAR(com.item.management.client.service.CheckAvailableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_AR, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CheckAvailableServiceFutureStub extends io.grpc.stub.AbstractStub<CheckAvailableServiceFutureStub> {
    private CheckAvailableServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckAvailableServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckAvailableServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckAvailableServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.item.management.client.service.CheckAvailableRequestResponse> checkAR(
        com.item.management.client.service.CheckAvailableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_AR, getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_AR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckAvailableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckAvailableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_AR:
          serviceImpl.checkAR((com.item.management.client.service.CheckAvailableRequest) request,
              (io.grpc.stub.StreamObserver<com.item.management.client.service.CheckAvailableRequestResponse>) responseObserver);
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

  private static final class CheckAvailableServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.item.management.client.service.CheckAvailableServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CheckAvailableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckAvailableServiceDescriptorSupplier())
              .addMethod(METHOD_CHECK_AR)
              .build();
        }
      }
    }
    return result;
  }
}
