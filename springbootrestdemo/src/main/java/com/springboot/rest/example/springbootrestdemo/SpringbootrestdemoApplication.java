package com.springboot.rest.example.springbootrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.springboot.rest.example.domain")
@SpringBootApplication
public class SpringbootrestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestdemoApplication.class, args);
	}

}
