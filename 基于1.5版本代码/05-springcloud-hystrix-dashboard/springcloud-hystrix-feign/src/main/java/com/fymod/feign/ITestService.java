package com.fymod.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-1", fallback=TestCallBack.class)
@Service(value="testService")
public interface ITestService {

	@RequestMapping(value = "/hi")
    String sayHiFromClient(@RequestParam(value = "name") String name);
	
}
