package com.karmen.grpc.controlCenter;

import io.grpc.stub.StreamObserver;


public class ControlService extends controlCenterGrpc.controlCenterImplBase{
    @Override
    public void checkLampStatus(LampControl.LampRequest request, StreamObserver<LampControl.LampResponse> responseObserver) {
        int lampid = request.getLampId();

        try {
            for (int i = 0; i < 10; i++) {
                String result = lampid +" Lamp status is checkd"+ ", response number: " + i;
                LampControl.LampResponse response = LampControl.LampResponse.newBuilder()
                        .setResponseMsg(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }

        }

}
