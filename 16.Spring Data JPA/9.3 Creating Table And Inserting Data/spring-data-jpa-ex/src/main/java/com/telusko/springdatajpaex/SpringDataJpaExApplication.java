package com.telusko.springdatajpaex;

import com.telusko.springdatajpaex.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);
		Customer c1 = context.getBean(Customer.class);
		Customer c2 = context.getBean(Customer.class);
		Customer c3 = context.getBean(Customer.class);

		Customerrepo repo = context.getBean(Customerrepo.class);

		c1.setId(1);
		c1.setName("Prabhu");
		c1.setCountry("pakistan");

		c2.setId(2);
		c2.setName("Shantu");
		c2.setCountry("US");

		c3.setId(3);
		c3.setName("Hanumesh");
		c3.setCountry("Westindies");

//		repo.save(c1);
//		repo.save(c2);
//		repo.save(c3);
//
//		System.out.println(repo.findAll());
//
//		System.out.println(repo.findById(4));

//		System.out.println(repo.findByName("Prabhu"));
		repo.delete(c3);

	}

}
