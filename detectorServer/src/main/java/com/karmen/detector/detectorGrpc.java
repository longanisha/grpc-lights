package com.karmen.grpc.detector;

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
    comments = "Source: detector.proto")
public final class detectorGrpc {

  private detectorGrpc() {}

  public static final String SERVICE_NAME = "detector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Detector.DetectorRequest,
      Detector.DetectorResponse> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkStatus",
      requestType = Detector.DetectorRequest.class,
      responseType = Detector.DetectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Detector.DetectorRequest,
      Detector.DetectorResponse> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<Detector.DetectorRequest, Detector.DetectorResponse> getCheckStatusMethod;
    if ((getCheckStatusMethod = detectorGrpc.getCheckStatusMethod) == null) {
      synchronized (detectorGrpc.class) {
        if ((getCheckStatusMethod = detectorGrpc.getCheckStatusMethod) == null) {
          detectorGrpc.getCheckStatusMethod = getCheckStatusMethod = 
              io.grpc.MethodDescriptor.<Detector.DetectorRequest, Detector.DetectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "detector", "checkStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Detector.DetectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Detector.DetectorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new detectorMethodDescriptorSupplier("checkStatus"))
                  .build();
          }
        }
     }
     return getCheckStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static detectorStub newStub(io.grpc.Channel channel) {
    return new detectorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static detectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new detectorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static detectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new detectorFutureStub(channel);
  }

  /**
   */
  public static abstract class detectorImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkStatus(Detector.DetectorRequest request,
                            io.grpc.stub.StreamObserver<Detector.DetectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Detector.DetectorRequest,
                Detector.DetectorResponse>(
                  this, METHODID_CHECK_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class detectorStub extends io.grpc.stub.AbstractStub<detectorStub> {
    private detectorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private detectorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected detectorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new detectorStub(channel, callOptions);
    }

    /**
     */
    public void checkStatus(Detector.DetectorRequest request,
                            io.grpc.stub.StreamObserver<Detector.DetectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class detectorBlockingStub extends io.grpc.stub.AbstractStub<detectorBlockingStub> {
    private detectorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private detectorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected detectorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new detectorBlockingStub(channel, callOptions);
    }

    /**
     */
    public Detector.DetectorResponse checkStatus(Detector.DetectorRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class detectorFutureStub extends io.grpc.stub.AbstractStub<detectorFutureStub> {
    private detectorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private detectorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected detectorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new detectorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Detector.DetectorResponse> checkStatus(
        Detector.DetectorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final detectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(detectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((Detector.DetectorRequest) request,
              (io.grpc.stub.StreamObserver<Detector.DetectorResponse>) responseObserver);
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

  private static abstract class detectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    detectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Detector.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("detector");
    }
  }

  private static final class detectorFileDescriptorSupplier
      extends detectorBaseDescriptorSupplier {
    detectorFileDescriptorSupplier() {}
  }

  private static final class detectorMethodDescriptorSupplier
      extends detectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    detectorMethodDescriptorSupplier(String methodName) {
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
      synchronized (detectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new detectorFileDescriptorSupplier())
              .addMethod(getCheckStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
