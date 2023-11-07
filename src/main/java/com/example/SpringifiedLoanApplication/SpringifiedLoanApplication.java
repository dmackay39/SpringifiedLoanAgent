package com.example.SpringifiedLoanApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringifiedLoanApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringifiedLoanApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
