package com.fymod.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud6ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud6ZuulServerApplication.class, args);
	}
}
