package com.narender.springvaultkv2;

import com.narender.springvaultkv2.model.KVDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.core.ReactiveVaultTemplate;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringVaultKv2Application {

	@Autowired
	private ReactiveVaultTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultKv2Application.class, args);
	}


	@Bean
	public KVDataModel getKVData(){
		KVDataModel kv=new KVDataModel();
		template.read("val1/myapp1").flatMap(data->{
			kv.setPassword(data.getData().get("password").toString());
			kv.setUsername(data.getData().get("username").toString());
			return Mono.empty();
		}).subscribe();
		return kv;
	}
}
