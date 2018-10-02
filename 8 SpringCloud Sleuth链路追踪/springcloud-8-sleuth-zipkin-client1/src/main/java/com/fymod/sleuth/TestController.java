package com.fymod.sleuth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/client1")
	public String test1() {
		return "client1方法返回值";
	}
	
}
