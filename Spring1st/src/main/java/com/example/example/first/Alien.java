package com.example.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	//This means that Laptop object is created by spring
	@Autowired
	Latptop lap;
	
    public void code(){
//        System.out.println("I'm learning Spring using Spring Suite Tool.");
    	lap.compile();
    }

}