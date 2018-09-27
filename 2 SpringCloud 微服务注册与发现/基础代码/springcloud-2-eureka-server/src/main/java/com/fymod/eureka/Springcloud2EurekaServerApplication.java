package com.fymod.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud2EurekaServerApplication.class, args);
	}
}
