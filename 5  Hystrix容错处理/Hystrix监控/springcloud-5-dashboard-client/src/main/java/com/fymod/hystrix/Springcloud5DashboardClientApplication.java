package com.fymod.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud5DashboardClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud5DashboardClientApplication.class, args);
	}
}
