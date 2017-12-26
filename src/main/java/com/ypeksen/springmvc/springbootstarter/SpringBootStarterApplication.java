package com.ypeksen.springmvc.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class SpringBootStarterApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}
}
