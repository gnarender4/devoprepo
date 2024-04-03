package com.narender.springvaultkv2.handler;


import com.narender.springvaultkv2.model.KVDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.vault.core.ReactiveVaultTemplate;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class StudentHandler {


    @Autowired
    private KVDataModel kmodel;


    public Mono<ServerResponse> getKv1(ServerRequest req){

        return ServerResponse.ok().bodyValue(kmodel.getUsername());

    }
}
