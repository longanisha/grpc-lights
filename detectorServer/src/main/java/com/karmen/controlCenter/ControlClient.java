package com.karmen.grpc.controlCenter;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class ControlClient {
    public void run() throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9093)
                .usePlaintext()
                .build();
        controlCenterGrpc.controlCenterBlockingStub client =
                controlCenterGrpc.newBlockingStub(channel);


        checkLamps(client);

        channel.shutdown();
    }
    private void checkLamps(controlCenterGrpc.controlCenterBlockingStub client) {


        try {
            LampControl.LampRequest lampStatusReq =
                    LampControl.LampRequest.newBuilder()
                            .setLampId(1)
                            .build();

            // Server streaming
            Iterator<LampControl.LampResponse> res =
                    client.checkLampStatus(lampStatusReq);
            res.forEachRemaining(response -> {
                System.out.println(response.getResponseMsg());
            });

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ControlClient c = new ControlClient();
        try {
            c.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
