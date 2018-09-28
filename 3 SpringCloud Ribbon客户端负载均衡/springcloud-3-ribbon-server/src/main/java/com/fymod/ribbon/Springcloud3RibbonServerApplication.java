package com.fymod.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud3RibbonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud3RibbonServerApplication.class, args);
	}
}
