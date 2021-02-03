package com.mydatabase.dbproject;

import com.mydatabase.dbproject.domain.Student;
import com.mydatabase.dbproject.repository.StudentRepository;
import com.mydatabase.dbproject.service.StudentService;
import com.mydatabase.dbproject.service.StudentServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mydatabase.dbproject.repository")
public class DbprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentServiceImpl service) {
		return (args) -> {
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
			service.save(new Student("Alex", "Chemistry"));
		};
	}
}
