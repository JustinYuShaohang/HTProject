package com.htproject.htproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HtprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(HtprojectApplication.class, args);
	}
	@PostConstruct
	public void init()
	{
		Logger log = LoggerFactory.getLogger(HtprojectApplication.class);
		log.info("Java app started");
	}

	public String getStatus() {
		return "OK";
	}

}
