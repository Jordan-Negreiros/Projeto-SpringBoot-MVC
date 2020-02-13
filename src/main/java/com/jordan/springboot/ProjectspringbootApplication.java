package com.jordan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.jordan.springboot.model")
public class ProjectspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectspringbootApplication.class, args);
	}

}
