package com.example.demoPersistence;

import com.example.demoPersistence.entity.User;
import com.example.demoPersistence.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoPersistenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPersistenceApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoPersistenceApplication.class);

	@Bean
	public CommandLineRunner demo(UserRepository userRepository){
		return (args) -> {
			saveTestUser(userRepository);
		};
	}

	private void saveTestUser(UserRepository repository){
		repository.save(new User("Test User1", "test1@gmail.com","pass1", "This is a test user 1"));
		repository.save(new User("Test User2", "test2@gmail.com","pass2", "This is a test user 2"));
		repository.save(new User("Test User3", "test3@gmail.com","pass3", "This is a test user 3"));
		repository.save(new User("Test User4", "test4@gmail.com","pass4", "This is a test user 4"));
		repository.save(new User("Test User5", "test5@gmail.com","pass5", "This is a test user 5"));
		repository.save(new User("Test User6", "test6@gmail.com","pass6", "This is a test user 6"));
	}
}
