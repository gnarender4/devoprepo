package com.narender.jenkinsdemo1.handler;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class StudentHandler {


    public Mono<ServerResponse> getresp(ServerRequest req) {
        return ServerResponse.ok().bodyValue("Hello World");
    }
}
