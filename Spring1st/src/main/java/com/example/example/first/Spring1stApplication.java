package com.example.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1stApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Spring1stApplication.class, args);
		
		// Alien obj = new Alien();
		//By using spring
		Alien obj = context.getBean(Alien.class);
		//getbean() method belongs to an interface called Appliction Context.

		obj.code();
	}

}
