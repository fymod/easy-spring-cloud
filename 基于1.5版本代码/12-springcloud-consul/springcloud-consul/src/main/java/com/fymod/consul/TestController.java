package com.fymod.consul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return "hi";
    }
    
}
