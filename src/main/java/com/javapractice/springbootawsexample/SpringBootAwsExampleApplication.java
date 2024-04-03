package com.javapractice.springbootawsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {
	
	
	@GetMapping("/")
	public String sayHello()
	{
		return "welcome to aws";
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsExampleApplication.class, args);
	}

}
