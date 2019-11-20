package com.fiap.PesquisaSatisfacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration( exclude= {
		MongoAutoConfiguration.class, 
		MongoRepositoriesAutoConfiguration.class, 
		MongoDataAutoConfiguration.class })
public class PesquisaSatisfacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PesquisaSatisfacaoApplication.class, args);
	}

}
