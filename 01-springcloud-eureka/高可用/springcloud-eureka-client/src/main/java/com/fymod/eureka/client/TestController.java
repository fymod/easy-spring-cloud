package com.fymod.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${server.port}")
    String port;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "参数name: "+name+" ; 端口:" +port;
    }
    
}
