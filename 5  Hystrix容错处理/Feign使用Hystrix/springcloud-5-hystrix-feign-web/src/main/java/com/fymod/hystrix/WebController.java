package com.fymod.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@Autowired private IMyFeignClient myFeignClient;

	@GetMapping("/test")
    public String test() {
        String result = myFeignClient.test(234L);
        System.out.println(result);
        return result;
    }
	
}
