package com.example.dbs.databaseaws;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseawsApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(PersonRepository personRepository)
	{
		return args ->{
			personRepository.save(new Person("John", "smith"));
			personRepository.save(new Person("Hi", "there"));
		};
	}
}
