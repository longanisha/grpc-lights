package com.karmen.grpc.lamp;

import io.grpc.stub.StreamObserver;

public class LampService extends lampGrpc.lampImplBase{
    @Override
    public void switchLamp(Lamp.OnOffRequest request, StreamObserver<Lamp.OnOffResponse> responseObserver) {


        boolean isOn =request.getToggleLamp();
        int lampId = request.getLampId();
        Lamp.OnOffResponse.Builder response = Lamp.OnOffResponse.newBuilder();

        if(isOn){
            //success message
            response.setResponseCode(1).setResponseMsg("Lamp "+lampId + " is on");

        } else  {
            //failure message
            response.setResponseCode(0).setResponseMsg("Lamp "+lampId +" is off");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
