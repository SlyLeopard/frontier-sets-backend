package com.frontier;

// Imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// Annotations
@SpringBootApplication(scanBasePackages = "com.frontier")
@EnableMongoRepositories(basePackages = "com.frontier.repository")

// Class
public class BackendApplication {

	// Methods
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
