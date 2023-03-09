package com.myapp.grpc_demo.client;

import com.myapp.grpc_demo.proto.GreetingServiceGrpc;
import com.myapp.grpc_demo.proto.HelloRequest;
import com.myapp.grpc_demo.proto.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;
import java.util.stream.Stream;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext().build();
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        HelloResponse response = stub.greeting(
                HelloRequest.newBuilder()
                        .setFirstname(System.getProperty("user.name"))
                        .setLastname("mittal")
                        .setAge(18)
                        .addHobbies("programming")
                        .addHobbies("drinking")
                        .addHobbies("partying")
                        .putBagOfTricks("1", "love coding")
                        .build());
        String greeting = response.getGreeting();
        System.out.println("greeting : " + greeting);
    }
}
