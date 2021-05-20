package helloworld.impl.server;

import helloworld.HelloRequest;
import helloworld.HelloResponse;
import helloworld.HelloServiceGrpc.HelloServiceImplBase;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceImplBase {
    @Override
    public void hello(
      HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = new StringBuilder()
          .append("Hello, ")
          .append(request.getFirstName())
          .append(" ")
          .append(request.getLastName())
          .toString();

        HelloResponse response = HelloResponse.newBuilder()
          .setGreeting(greeting)
          .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}