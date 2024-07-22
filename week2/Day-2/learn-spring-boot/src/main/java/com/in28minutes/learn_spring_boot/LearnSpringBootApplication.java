package com.in28minutes.learn_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
public class LearnSpringBootApplication {

	public static void main(String[] args)  {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
