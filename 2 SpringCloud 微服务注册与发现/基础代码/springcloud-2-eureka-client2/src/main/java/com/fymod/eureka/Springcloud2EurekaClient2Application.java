package com.fymod.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud2EurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud2EurekaClient2Application.class, args);
	}
}
