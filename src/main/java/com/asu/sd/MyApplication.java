package com.asu.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asu.sd.service.impl.AutomationService;
import com.asu.sd.service.impl.EnvironmentService;

@SpringBootApplication
public class MyApplication {

	@Autowired
	AutomationService automationService;

	@Autowired
	EnvironmentService environmentService;
	
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}


