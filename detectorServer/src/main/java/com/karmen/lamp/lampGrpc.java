package com.karmen.grpc.lamp;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: lamp.proto")
public final class lampGrpc {

  private lampGrpc() {}

  public static final String SERVICE_NAME = "lamp";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Lamp.OnOffRequest,
      Lamp.OnOffResponse> getSwitchLampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchLamp",
      requestType = Lamp.OnOffRequest.class,
      responseType = Lamp.OnOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Lamp.OnOffRequest,
      Lamp.OnOffResponse> getSwitchLampMethod() {
    io.grpc.MethodDescriptor<Lamp.OnOffRequest, Lamp.OnOffResponse> getSwitchLampMethod;
    if ((getSwitchLampMethod = lampGrpc.getSwitchLampMethod) == null) {
      synchronized (lampGrpc.class) {
        if ((getSwitchLampMethod = lampGrpc.getSwitchLampMethod) == null) {
          lampGrpc.getSwitchLampMethod = getSwitchLampMethod = 
              io.grpc.MethodDescriptor.<Lamp.OnOffRequest, Lamp.OnOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lamp", "switchLamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Lamp.OnOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Lamp.OnOffResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new lampMethodDescriptorSupplier("switchLamp"))
                  .build();
          }
        }
     }
     return getSwitchLampMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static lampStub newStub(io.grpc.Channel channel) {
    return new lampStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static lampBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new lampBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static lampFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new lampFutureStub(channel);
  }

  /**
   */
  public static abstract class lampImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchLamp(Lamp.OnOffRequest request,
                           io.grpc.stub.StreamObserver<Lamp.OnOffResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchLampMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchLampMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Lamp.OnOffRequest,
                Lamp.OnOffResponse>(
                  this, METHODID_SWITCH_LAMP)))
          .build();
    }
  }

  /**
   */
  public static final class lampStub extends io.grpc.stub.AbstractStub<lampStub> {
    private lampStub(io.grpc.Channel channel) {
      super(channel);
    }

    private lampStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected lampStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new lampStub(channel, callOptions);
    }

    /**
     */
    public void switchLamp(Lamp.OnOffRequest request,
                           io.grpc.stub.StreamObserver<Lamp.OnOffResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchLampMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class lampBlockingStub extends io.grpc.stub.AbstractStub<lampBlockingStub> {
    private lampBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private lampBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected lampBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new lampBlockingStub(channel, callOptions);
    }

    /**
     */
    public Lamp.OnOffResponse switchLamp(Lamp.OnOffRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchLampMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class lampFutureStub extends io.grpc.stub.AbstractStub<lampFutureStub> {
    private lampFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private lampFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected lampFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new lampFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Lamp.OnOffResponse> switchLamp(
        Lamp.OnOffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchLampMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_LAMP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final lampImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(lampImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_LAMP:
          serviceImpl.switchLamp((Lamp.OnOffRequest) request,
              (io.grpc.stub.StreamObserver<Lamp.OnOffResponse>) responseObserver);
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

  private static abstract class lampBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    lampBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Lamp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("lamp");
    }
  }

  private static final class lampFileDescriptorSupplier
      extends lampBaseDescriptorSupplier {
    lampFileDescriptorSupplier() {}
  }

  private static final class lampMethodDescriptorSupplier
      extends lampBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    lampMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (lampGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new lampFileDescriptorSupplier())
              .addMethod(getSwitchLampMethod())
              .build();
        }
      }
    }
    return result;
  }
}
