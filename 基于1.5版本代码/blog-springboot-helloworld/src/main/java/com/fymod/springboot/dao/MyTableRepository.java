package com.fymod.springboot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fymod.springboot.domain.MyTable;

public interface MyTableRepository extends JpaRepository<MyTable, Serializable>{

	public List<MyTable> findByName(String name);
	
}
