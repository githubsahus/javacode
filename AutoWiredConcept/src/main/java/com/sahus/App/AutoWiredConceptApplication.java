package com.sahus.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWiredConceptApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AutoWiredConceptApplication.class, args);
		Laptop laptop = context.getBean(Laptop.class);
		laptop.code();
	}

}
