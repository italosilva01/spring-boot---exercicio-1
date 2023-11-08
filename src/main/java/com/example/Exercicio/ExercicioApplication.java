package com.example.Exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication(scanBasePackages= "com.example")
public class ExercicioApplication {

	public static void main(String[] args) throws 	Throwable {
		SpringApplication.run(ExercicioApplication.class, args);
		
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name",defaultValue = "world")String name) {
		return String.format("Hello %s!", name);
	}
}
