package com.karmen.grpc.detector;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DetectorClient {

    public static void main(String[] args){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();

        //stub from proto file

        detectorGrpc.detectorBlockingStub stub =  detectorGrpc.newBlockingStub(channel);


        Detector.DetectorRequest request = Detector.DetectorRequest.newBuilder().setIsDetected(true).build();

        Detector.DetectorResponse response = stub.checkStatus(request);

        System.out.println("Detector Response : "+ response.getResponsemsg());

    }

}
