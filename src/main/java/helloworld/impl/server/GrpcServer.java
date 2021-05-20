package helloworld.impl.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
    	System.out.println("Start server");
        Server server = ServerBuilder
          .forPort(8080)
          .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
    	System.out.println("Stop server");

    }
}