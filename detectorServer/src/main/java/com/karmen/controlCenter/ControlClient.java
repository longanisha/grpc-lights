package com.karmen.grpc.controlCenter;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ControlClient {
    public void run() throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9093)
                .usePlaintext()
                .build();
        controlCenterGrpc.controlCenterBlockingStub client =
                controlCenterGrpc.newBlockingStub(channel);

// checkLamps
//        checkLamps(client);
        bidirectionalStreamingChat(channel);
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

    private void bidirectionalStreamingChat(ManagedChannel channel) {
        controlCenterGrpc.controlCenterStub asyncClient = controlCenterGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<LampControl.ChatRequest> requestStreamObserver =
                asyncClient.chatWithAgent(new StreamObserver<LampControl.ChatResponse>() {
                    @Override
                    public void onNext(LampControl.ChatResponse value) {
                        String result = value.getResponseMsg();
                        System.out.println("Chat response from server: "+ result);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server is done sending data");
                        latch.countDown();
                    }
                });

        Arrays.asList("Hi", "How are you ", "Thank you").forEach(chat -> {
            System.out.println("Sending: "+ chat);
            requestStreamObserver.onNext(LampControl.ChatRequest.newBuilder().setChatMsg(chat).build());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        requestStreamObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
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
