package com.myapp.grpc_demo.service;

import com.myapp.grpc_demo.proto.GreetingServiceGrpc;
import com.myapp.grpc_demo.proto.HelloRequest;
import com.myapp.grpc_demo.proto.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        responseObserver.onNext(
                HelloResponse.newBuilder()
                        .setGreeting("Good Morning : " + request.getFirstname())
                        .build()
        );
        responseObserver.onCompleted();
    }
}
