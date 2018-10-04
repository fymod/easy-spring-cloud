package com.fymod.feign;

import org.springframework.stereotype.Component;

@Component
public class TestCallBack implements ITestService {

	@Override
	public String sayHiFromClient(String name) {
		return "错误了 " + name;
	}

}
