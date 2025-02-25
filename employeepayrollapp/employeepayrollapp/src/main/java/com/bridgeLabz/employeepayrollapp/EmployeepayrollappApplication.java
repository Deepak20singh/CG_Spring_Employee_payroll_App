package com.bridgeLabz.employeepayrollapp;


import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EmployeepayrollappApplication {
	private static final Logger log = LoggerFactory.getLogger(EmployeepayrollappApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeepayrollappApplication.class, args);
		log.info("Application has started in {} environment",
				context.getEnvironment().getProperty("environment"));
	}
}
