package com.springreactive.springreactivedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableReactiveMongoRepositories
public class SpringreactivedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactivedemoApplication.class, args);
	}

}
