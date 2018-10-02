package com.fymod.sleuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired private RestTemplate restTemplate;
	
	@GetMapping("/client2")
	public String test1() {
		return restTemplate.getForObject("http://localhost:9091/client1", String.class);
	}
	
}
