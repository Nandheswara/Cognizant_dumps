package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.*"})
public class FlawlessAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlawlessAcademyApplication.class, args);
	}

}
