package com.fymod.hystrix;

import org.springframework.stereotype.Component;

@Component
public class TestCallBack implements IMyFeignClient {

	@Override
	public String test(Long id) {
		return "错误信息显示";
	}

}
