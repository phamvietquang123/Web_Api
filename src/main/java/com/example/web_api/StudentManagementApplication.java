package com.example.web_api;

import com.example.web_api.student.Student;
import com.example.web_api.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Bean
	public CommandLineRunner initializeUsers(StudentRepository studentRepository) {
		return args -> {
			// Add your logic to create and save the initial users
			Student student1 = new Student("Anne","Anne123@gmail.com", 19, "Computer Science");
			studentRepository.save(student1);

			Student student2 = new Student("Frank","Frank123@gmail.com",20,"Finance");

			studentRepository.save(student2);
		};
	}
}
