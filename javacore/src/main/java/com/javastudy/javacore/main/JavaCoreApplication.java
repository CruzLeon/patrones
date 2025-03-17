package com.javastudy.javacore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.javastudy.javacore.*")
@SpringBootApplication
public class JavaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCoreApplication.class, args);
	}

}
