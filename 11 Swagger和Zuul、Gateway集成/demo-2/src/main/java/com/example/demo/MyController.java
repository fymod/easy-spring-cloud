package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
// Api:用在请求的类上，表示对类的说明
// tags:说明该类的作用，可以在UI界面上看到的注解
@Api(value="/test2", tags="这是模块名称22222222222")
@RequestMapping("/test2")
@RestController
public class MyController {
	// ApiOperation：用在请求的方法上，说明方法的用途、作用
    // value:说明方法的用途、作用
	// notes:方法的备注说明
	@ApiOperation(value="这是列表", notes="这是列表")
	@GetMapping("/list")
	public List<String> getList() {
		return Arrays.asList("str1", "str2", "str333", "str8888");
	}
	
	@ApiOperation(value="添加用户信息", notes = "添加用户信息")
    @ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
		if(user.getId() < 10) {
			return new User(0, "测试");
		}
        return new User(1, "有数据");
    }
	
}
