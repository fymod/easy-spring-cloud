package com.fymod.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud4FeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud4FeignClient1Application.class, args);
	}
}
