package com.fymod.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Springcloud6ZuulWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud6ZuulWebApplication.class, args);
	}
}
