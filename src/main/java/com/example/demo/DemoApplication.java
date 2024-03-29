package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.MampService;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Application");
		SpringApplication.run(DemoApplication.class, args);
	}

}
