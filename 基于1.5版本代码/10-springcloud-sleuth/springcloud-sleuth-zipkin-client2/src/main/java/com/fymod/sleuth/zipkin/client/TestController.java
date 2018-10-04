package com.fymod.sleuth.zipkin.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/client21")
    public String callHome(){
        return restTemplate.getForObject("http://localhost:8801/client12", String.class);
    }
	
    @RequestMapping("/client22")
    public String info(){
        return "client22";
    }
    
}
