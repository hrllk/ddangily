package com.rnj.ddangily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DdangilyApplication {


	/* Spring Boot 는 main 이 존재하는 package 하위가 base dir이 된다. 따로 servlet context 에 설정해줄 필요가 없다. */
	public static void main(String[] args) {
		SpringApplication.run(DdangilyApplication.class, args);
	}

}
