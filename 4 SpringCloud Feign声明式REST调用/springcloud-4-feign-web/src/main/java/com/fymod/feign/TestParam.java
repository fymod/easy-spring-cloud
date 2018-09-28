package com.fymod.feign;

public class TestParam {
	
	private int id;
	private String name;
	
	public TestParam(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestParam [id=" + id + ", name=" + name + "]";
	}
	
}