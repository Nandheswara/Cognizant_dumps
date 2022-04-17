package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.*"})
public class SnapFitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnapFitnessApplication.class, args);
	}

}
