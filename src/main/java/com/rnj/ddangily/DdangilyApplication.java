package com.rnj.ddangily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DdangilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdangilyApplication.class, args);
	}

}
