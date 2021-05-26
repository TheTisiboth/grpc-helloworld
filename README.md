# grpc-helloworld

### Description

This project is a helloworld project, that run a Java gRPC service, and transcode it to HTTP.
## Commands

Run `mvn clean package` to compile the proto files.

Run `start-envoy.sh` to deploy the app in a docker container.

You should be able to target the server thanks to an http request, for example:
`curl http://localhost:51051/greeting`

## Links

I followed this [tutorial](https://blog.jdriven.com/2018/11/transcoding-grpc-to-http-json-using-envoy/) for building a Java gRPC service and transcode it to HTTP.   
I have updated the envoy config file to the envoy API V3 thanks to this [example](https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/grpc_json_transcoder_filter) (official envoy documentation).   
A useful [tool](https://envoylint.com/) to check the envoy config file.   

