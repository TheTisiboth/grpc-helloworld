package helloworld.impl.client;

import helloworld.HelloRequest;
import helloworld.HelloResponse;
import helloworld.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class GrpcClient {
	public static void main(String[] args) {
		System.out.println("Start client");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

		HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
		HelloResponse helloResponse;
		try {
			helloResponse = stub.hello(HelloRequest.newBuilder().setFirstName("Baeldung").setLastName("gRPC").build());
		} catch (final StatusRuntimeException e) {
			System.out.println("RPC failed: " + e.getStatus());
			return;
		}
		System.out.println("Greeting: " + helloResponse.getGreeting());

		channel.shutdown();
		System.out.println("Stop client");

	}
}