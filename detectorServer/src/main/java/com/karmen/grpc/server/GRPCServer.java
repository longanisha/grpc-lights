package com.karmen.grpc.server;
import com.karmen.grpc.service.DetectedService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9091).addService(new DetectedService()).build();

        server.start();

        System.out.println("Road lamp server started on " + server.getPort());

        server.awaitTermination();

    }
}
