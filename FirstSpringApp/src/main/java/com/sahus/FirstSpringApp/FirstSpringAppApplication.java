package com.sahus.FirstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
		simple obj = context.getBean(simple.class);
		obj.printSimple();
	}

}
