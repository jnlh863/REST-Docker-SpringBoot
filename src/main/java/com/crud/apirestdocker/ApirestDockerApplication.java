package com.crud.apirestdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.crud.apirestdocker", "com.crud.apirestdocker.exception"})
public class ApirestDockerApplication {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		SpringApplication.run(ApirestDockerApplication.class, args);
	}
}
