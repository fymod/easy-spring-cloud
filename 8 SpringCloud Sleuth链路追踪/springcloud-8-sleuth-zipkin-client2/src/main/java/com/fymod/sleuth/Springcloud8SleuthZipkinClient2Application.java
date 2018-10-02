package com.fymod.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springcloud8SleuthZipkinClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud8SleuthZipkinClient2Application.class, args);
	}
	
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
}
