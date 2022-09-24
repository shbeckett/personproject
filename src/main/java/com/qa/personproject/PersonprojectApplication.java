package com.qa.personproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PersonprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PersonprojectApplication.class, args);
	}

	@Bean
	public String greeting() {
		return "Hello, World!";
	}

	@GetMapping("/helloyou")
	public String sayHelloYou(@RequestParam(name = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
