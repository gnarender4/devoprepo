package com.narender.jenkinsgradle1.router;

import com.narender.jenkinsgradle1.handler.StudentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class StudentRouter {

    @Autowired
    private StudentHandler studentHandler;


    @Bean
    public RouterFunction<ServerResponse> router(){
        return RouterFunctions.route(RequestPredicates.POST("/hello"),studentHandler::getmsg);
    }
}
