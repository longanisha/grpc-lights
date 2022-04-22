package com.karmen.grpc.detector;

import io.grpc.stub.StreamObserver;

public class DetectedService extends detectorGrpc.detectorImplBase{
    @Override
    public void checkStatus(Detector.DetectorRequest request, StreamObserver<Detector.DetectorResponse> responseObserver) {

        boolean isDetected =request.getIsDetected();
        Detector.DetectorResponse.Builder response = Detector.DetectorResponse.newBuilder();

        if(isDetected){
            //success message
            response.setResponseCode(1).setResponsemsg("Is Detected");

        } else  {
            //failure message
            response.setResponseCode(0).setResponsemsg("Is not Detected");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
