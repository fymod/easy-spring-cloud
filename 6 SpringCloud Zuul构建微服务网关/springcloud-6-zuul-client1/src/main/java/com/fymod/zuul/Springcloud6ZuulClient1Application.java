package com.fymod.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud6ZuulClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud6ZuulClient1Application.class, args);
	}
}
