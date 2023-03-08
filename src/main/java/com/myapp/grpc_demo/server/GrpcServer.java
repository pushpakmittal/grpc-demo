package com.myapp.grpc_demo.server;

import com.myapp.grpc_demo.service.GreetingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(8080).addService(new GreetingServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
