package com.karmen.grpc.lamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class LampClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();

        //stub from proto file

        lampGrpc.lampBlockingStub stub = lampGrpc.newBlockingStub(channel);

        Lamp.OnOffRequest request = Lamp.OnOffRequest.newBuilder().setToggleLamp(true).setLampId(1).build();
        Lamp.OnOffResponse response;

        // Handle Error
        try {
            response = stub.switchLamp(request);
        } catch (StatusRuntimeException e) {
            System.out.println("Detector failed : "+ e.getStatus());
            return;
        }
        System.out.println("Detector Response : "+ response.getResponseMsg());

    }
}
