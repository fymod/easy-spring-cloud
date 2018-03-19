package com.fymod.sleuth.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringcloudSleuthZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSleuthZipkinServerApplication.class, args);
	}
	
}
