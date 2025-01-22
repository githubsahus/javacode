package com.springboot;

import com.springboot.model.Alien;
import com.springboot.model.Laptop;
import com.springboot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Laptop lap = context.getBean(Laptop.class);
//		Alien alien = (Alien) context.getBean("alien");
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptopToDB(lap);
//		alien.code();
	}

}
