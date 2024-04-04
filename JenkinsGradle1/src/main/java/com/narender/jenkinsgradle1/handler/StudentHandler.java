package com.narender.jenkinsgradle1.handler;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class StudentHandler {


    public Mono<ServerResponse> getmsg(ServerRequest req){
        return ServerResponse.ok().bodyValue("Hello World");
    }
}
