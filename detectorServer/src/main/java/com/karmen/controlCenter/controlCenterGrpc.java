package com.karmen.grpc.controlCenter;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: lampControl.proto")
public final class controlCenterGrpc {

  private controlCenterGrpc() {}

  public static final String SERVICE_NAME = "controlCenter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LampControl.LampRequest,
      LampControl.LampResponse> getCheckLampStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkLampStatus",
      requestType = LampControl.LampRequest.class,
      responseType = LampControl.LampResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<LampControl.LampRequest,
      LampControl.LampResponse> getCheckLampStatusMethod() {
    io.grpc.MethodDescriptor<LampControl.LampRequest, LampControl.LampResponse> getCheckLampStatusMethod;
    if ((getCheckLampStatusMethod = controlCenterGrpc.getCheckLampStatusMethod) == null) {
      synchronized (controlCenterGrpc.class) {
        if ((getCheckLampStatusMethod = controlCenterGrpc.getCheckLampStatusMethod) == null) {
          controlCenterGrpc.getCheckLampStatusMethod = getCheckLampStatusMethod =
              io.grpc.MethodDescriptor.<LampControl.LampRequest, LampControl.LampResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "controlCenter", "checkLampStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LampControl.LampRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LampControl.LampResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new controlCenterMethodDescriptorSupplier("checkLampStatus"))
                  .build();
          }
        }
     }
     return getCheckLampStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LampControl.ChatRequest,
      LampControl.ChatResponse> getChatWithAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chatWithAgent",
      requestType = LampControl.ChatRequest.class,
      responseType = LampControl.ChatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<LampControl.ChatRequest,
      LampControl.ChatResponse> getChatWithAgentMethod() {
    io.grpc.MethodDescriptor<LampControl.ChatRequest, LampControl.ChatResponse> getChatWithAgentMethod;
    if ((getChatWithAgentMethod = controlCenterGrpc.getChatWithAgentMethod) == null) {
      synchronized (controlCenterGrpc.class) {
        if ((getChatWithAgentMethod = controlCenterGrpc.getChatWithAgentMethod) == null) {
          controlCenterGrpc.getChatWithAgentMethod = getChatWithAgentMethod =
              io.grpc.MethodDescriptor.<LampControl.ChatRequest, LampControl.ChatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "controlCenter", "chatWithAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LampControl.ChatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LampControl.ChatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new controlCenterMethodDescriptorSupplier("chatWithAgent"))
                  .build();
          }
        }
     }
     return getChatWithAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static controlCenterStub newStub(io.grpc.Channel channel) {
    return new controlCenterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static controlCenterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new controlCenterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static controlCenterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new controlCenterFutureStub(channel);
  }

  /**
   */
  public static abstract class controlCenterImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkLampStatus(LampControl.LampRequest request,
                                io.grpc.stub.StreamObserver<LampControl.LampResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckLampStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<LampControl.ChatRequest> chatWithAgent(
        io.grpc.stub.StreamObserver<LampControl.ChatResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatWithAgentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckLampStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                LampControl.LampRequest,
                LampControl.LampResponse>(
                  this, METHODID_CHECK_LAMP_STATUS)))
          .addMethod(
            getChatWithAgentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                LampControl.ChatRequest,
                LampControl.ChatResponse>(
                  this, METHODID_CHAT_WITH_AGENT)))
          .build();
    }
  }

  /**
   */
  public static final class controlCenterStub extends io.grpc.stub.AbstractStub<controlCenterStub> {
    private controlCenterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private controlCenterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected controlCenterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new controlCenterStub(channel, callOptions);
    }

    /**
     */
    public void checkLampStatus(LampControl.LampRequest request,
                                io.grpc.stub.StreamObserver<LampControl.LampResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCheckLampStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<LampControl.ChatRequest> chatWithAgent(
        io.grpc.stub.StreamObserver<LampControl.ChatResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatWithAgentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class controlCenterBlockingStub extends io.grpc.stub.AbstractStub<controlCenterBlockingStub> {
    private controlCenterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private controlCenterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected controlCenterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new controlCenterBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<LampControl.LampResponse> checkLampStatus(
        LampControl.LampRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCheckLampStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class controlCenterFutureStub extends io.grpc.stub.AbstractStub<controlCenterFutureStub> {
    private controlCenterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private controlCenterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected controlCenterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new controlCenterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHECK_LAMP_STATUS = 0;
  private static final int METHODID_CHAT_WITH_AGENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final controlCenterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(controlCenterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_LAMP_STATUS:
          serviceImpl.checkLampStatus((LampControl.LampRequest) request,
              (io.grpc.stub.StreamObserver<LampControl.LampResponse>) responseObserver);
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
        case METHODID_CHAT_WITH_AGENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chatWithAgent(
              (io.grpc.stub.StreamObserver<LampControl.ChatResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class controlCenterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    controlCenterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LampControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("controlCenter");
    }
  }

  private static final class controlCenterFileDescriptorSupplier
      extends controlCenterBaseDescriptorSupplier {
    controlCenterFileDescriptorSupplier() {}
  }

  private static final class controlCenterMethodDescriptorSupplier
      extends controlCenterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    controlCenterMethodDescriptorSupplier(String methodName) {
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
      synchronized (controlCenterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new controlCenterFileDescriptorSupplier())
              .addMethod(getCheckLampStatusMethod())
              .addMethod(getChatWithAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
