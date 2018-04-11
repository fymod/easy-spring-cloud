package com.fymod.quartz.controller;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fymod.quartz.config.MyScheduler;
import com.fymod.quartz.dao.ConfigRepository;

@RestController
public class ScheduleController {
	
	@Autowired
	private ConfigRepository repository;
	
	@RequestMapping("/modify")
	public @ResponseBody String modify() throws SchedulerException {
		MyScheduler.modifyJob1("0/1 * * * * ?");
		return "1";
	}
	
	@RequestMapping("/modify2")
	public @ResponseBody String modify2() throws SchedulerException {
		String cron = repository.findByTypes(100).get(0).getCron();
		MyScheduler.modifyJob1(cron);
		return "1";
	}
	
	@RequestMapping("/status")
	public @ResponseBody String status() throws SchedulerException {
		return MyScheduler.getJob1Status();
	}
	
	@RequestMapping("/pause")
	public @ResponseBody String pause() throws SchedulerException {
		MyScheduler.pauseJob1();
		return "1";
	}
	
	@RequestMapping("/resume")
	public @ResponseBody String resume() throws SchedulerException {
		MyScheduler.resumeJob1();
		return "1";
	}
	
}

