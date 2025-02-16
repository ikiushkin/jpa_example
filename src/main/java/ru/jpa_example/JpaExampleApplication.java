package ru.jpa_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "ru.jpa_example.repo")
@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

}
