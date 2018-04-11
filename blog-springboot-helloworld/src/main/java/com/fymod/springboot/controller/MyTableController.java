package com.fymod.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fymod.springboot.dao.MyTableRepository;
import com.fymod.springboot.domain.MyTable;

@RestController
public class MyTableController {

	@Value("${myUrl}")
	private String myUrl;
	
	@Autowired
	private MyTableRepository myTableRepository;
	
	@GetMapping("myurl")
	public String getMyUrl() {
		return myUrl;
	}
	
	@GetMapping("save")
	public boolean save() {
		MyTable table = new MyTable();
		table.setName("测试名称");
		myTableRepository.save(table);
		return true;
	}
	
	@GetMapping("query")
	public MyTable queryById(Long tableId) {
		return myTableRepository.findOne(tableId);
	}
	
	@GetMapping("query2")
	public List<MyTable> queryByName(String name) {
		return myTableRepository.findByName(name);
	}
	
}
