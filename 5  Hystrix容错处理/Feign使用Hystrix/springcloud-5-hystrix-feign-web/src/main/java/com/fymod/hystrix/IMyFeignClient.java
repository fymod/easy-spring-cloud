package com.fymod.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="hystrix-feign-client", fallback=TestCallBack.class)
public interface IMyFeignClient {

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public String test(@PathVariable("id") Long id);
	
}
