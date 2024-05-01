package com.dl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dl.service", "com.dl.controller"})
@EntityScan(basePackages = {"com.dl.model"})
public class DigitalLyncHomeModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalLyncHomeModuleApplication.class, args);
	}

}
