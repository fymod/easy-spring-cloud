package com.fymod.sleuth.zipkin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringcloudSleuthZipkinClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSleuthZipkinClientApplication.class, args);
	}
	
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	@Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
