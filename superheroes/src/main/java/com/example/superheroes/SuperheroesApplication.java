package com.example.superheroes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.superheroes.practice.Calculator;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SuperheroesApplication implements CommandLineRunner {

	@Autowired
	Calculator calc;

	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}

	@PostConstruct
	public void init () {
		System.out.println("Calculator has been created!!!");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Calculator will be destroyed");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
		int result = calc.addition(3, 4);
		System.out.println(result);



}}
