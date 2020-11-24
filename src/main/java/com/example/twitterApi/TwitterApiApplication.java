package com.example.twitterApi;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TwitterApiApplication {

	static{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}

	static Logger log = Logger.getLogger(TwitterApiApplication.class.getName());

	public static void main(String[] args) {
		log.info("application started");
		SpringApplication.run(TwitterApiApplication.class, args);
		log.warn("stopped");
	}
}
