package com.fymod.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Springcloud7ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud7ConfigServerApplication.class, args);
	}
}
