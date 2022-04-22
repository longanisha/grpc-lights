package com.karmen.grpc.lamp;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class LampServer {
    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9092).addService(new LampService()).build();

        server.start();

        System.out.println("Server started on " + server.getPort());

        server.awaitTermination();

    }
}
