package com.fymod.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud9ComposeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud9ComposeServerApplication.class, args);
	}
}
