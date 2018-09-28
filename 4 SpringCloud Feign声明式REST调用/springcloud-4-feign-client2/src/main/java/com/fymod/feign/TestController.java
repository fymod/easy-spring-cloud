package com.fymod.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/{id}")
	public String getMessage(@PathVariable Long id) {
		return "the request2 id is " + id;
	}
	
	@PostMapping("/post")
	public String post(@RequestBody TestParam testParam) {
		return "testParam 2:" + testParam.toString();
	}
	
}
