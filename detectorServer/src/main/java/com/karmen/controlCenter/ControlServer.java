package com.karmen.grpc.controlCenter;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ControlServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Contral Center server start");
        Server server = ServerBuilder.forPort(9093)
                .addService(new ControlService())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown request");
            server.shutdown();
            System.out.println("Successfully stoped the server");
        }));
        server.awaitTermination();
    }
}
