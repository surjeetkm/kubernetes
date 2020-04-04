package com.c2p.k8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleComponent {

	@Autowired
	private WelcomeConfiguration config;
	
	@Scheduled(fixedDelay = 3000)
	public void schedule() {
		System.out.println("Messages::::::::::::::::::"+config.getMessage());
	}
}
