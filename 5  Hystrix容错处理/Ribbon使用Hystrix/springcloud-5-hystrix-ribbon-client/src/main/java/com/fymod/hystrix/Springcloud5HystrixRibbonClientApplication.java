package com.fymod.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud5HystrixRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud5HystrixRibbonClientApplication.class, args);
	}
}
