package com.charanm.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootdemoApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
