# grpc-helloworld

## Commands

Run `mvn clean package` to compile the proto files.

Run `start-envoy.sh` to deploy the app in a docker container.

You should be able to target the server thanks to an http request, for example:
`curl http://localhost:51051/greeting`

A useful [tool](https://envoylint.com/) to check the envoy config file.   
An [example](https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/grpc_json_transcoder_filter) of envoy config file from the official documentation.
