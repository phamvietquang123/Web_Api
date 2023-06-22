package com.example.web_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}
	@Bean
	public CommandLineRunner initializeUsers(UserRepository userRepository) {
		return args -> {
			// Add your logic to create and save the initial users
			User user1 = new User("Anne","Anne123@gmail.com");
			userRepository.save(user1);

			User user2 = new User("Frank","Frank123@gmail.com");

			userRepository.save(user2);
		};
	}
}
