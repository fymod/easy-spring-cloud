package com.fymod.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud4FeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud4FeignServerApplication.class, args);
	}
}
