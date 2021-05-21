# grpc-helloworld

## Commands

Run `mvn clean package` to compile the proto files.

Run `start-envoy.sh` to deploy the app in a docker container.

You should be able to target the server thanks to an http request, for example:
`curl https://localhost:51051/test/greeting`