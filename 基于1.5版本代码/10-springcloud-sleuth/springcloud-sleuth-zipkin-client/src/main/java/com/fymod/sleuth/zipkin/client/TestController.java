package com.fymod.sleuth.zipkin.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/client11")
    public String callHome(){
        return restTemplate.getForObject("http://localhost:8802/client22", String.class);
    }
	
    @RequestMapping("/client12")
    public String info(){
        return "client12";
    }
    
}
