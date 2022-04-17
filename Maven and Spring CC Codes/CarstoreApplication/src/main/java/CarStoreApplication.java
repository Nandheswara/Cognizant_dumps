package com.cts.carstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.carstore.skeletonvalidator.SkeletonValidator;

@SpringBootApplication
public class CarStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarStoreApplication.class, args);

		new SkeletonValidator();
	}

}
