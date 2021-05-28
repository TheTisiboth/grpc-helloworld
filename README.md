# grpc-helloworld

### Description

This project is a helloworld project, that run a Java gRPC service, and transcode it to HTTP.
## Commands
CLone this repository:   
`git clone https://github.com/TheTisiboth/grpc-helloworld`

Move to the main directory:   
`cd grpc-helloworld`

Compile the whole project:   
`mvn clean package`

Run the server:   
`mvn exec:java -Dexec.mainClass=helloworld.impl.server.GrpcServer`

Deploy the envoy proxy in a docker container:   
`sh ./start-envoy.sh`

You should be able to target the server thanks to an http request, for example:   
`curl http://localhost:8080/greeting?firstName=John&lastName=Smith`


## VM

If you launched the envoy proxy in a VM, you can access the gRPC service from outside with the following steps:
Setup a bridge connection between the Host and Guest OS.
In the Guest OS (the VM), run the following command:   
`ip addr show`

You will see a bunch of network interfaces. Take the inet address that start with `192.168`, we will call it the `guest_ip`

Then, from your Host OS, you can request your gRPC service with the following command:   
`curl "guest_ip:8080/greeting?firstName=John&lastName=Smith"`

## Links

I followed this [tutorial](https://blog.jdriven.com/2018/11/transcoding-grpc-to-http-json-using-envoy/) for building a Java gRPC service and transcode it to HTTP.   
I have updated the envoy config file to the envoy API V3 thanks to this [example](https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/grpc_json_transcoder_filter) (official envoy documentation).   
A useful [tool](https://envoylint.com/) to check the envoy config file.   

