package com.fymod.quartz.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ScheduledJob implements Job{ 
	
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException { 
        System.out.println("第一个定时任务" + new Date()); 
    }
    
}
