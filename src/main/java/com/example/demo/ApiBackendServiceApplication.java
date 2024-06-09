package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.CustomerController;

@SpringBootApplication
@ComponentScan(basePackageClasses = CustomerController.class)
public class ApiBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBackendServiceApplication.class, args);
	}

}
