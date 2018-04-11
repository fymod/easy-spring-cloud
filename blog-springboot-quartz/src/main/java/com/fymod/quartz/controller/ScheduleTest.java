package com.fymod.quartz.controller;

import org.quartz.SchedulerException;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Configuration
@EnableScheduling
@Component
public class ScheduleTest {
	
	@Scheduled(fixedRate = 5000)
	public void scheduleUpdateCronTrigger() throws SchedulerException {
		System.out.println("5s运行一次，测试用的");
	}
	
}

