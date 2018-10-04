package com.fymod.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${name}")
    String name;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return name;
    }
    
}
