package com.fymod.quartz.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fymod.quartz.domain.Config;

public interface ConfigRepository extends JpaRepository<Config, Serializable> {

	public List<Config> findByTypes(Integer types);
}
