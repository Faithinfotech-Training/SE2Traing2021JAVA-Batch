package com.faith.app;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.faith.app.entity.User;
import com.faith.app.dao.UserRepository;



@SpringBootApplication
public class CrmApplication  {
	
	 @Autowired
	    private UserRepository repository;

	    @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "admin1", "admin1", "admin1@gmail.com"),
	                new User(102, "manager1", "manager1", "manager1@gmail.com"),
	                new User(103, "user1", "user1", "user1@gmail.com"),
	                new User(104, "user2", "user2", "user2@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }

	
	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
		System.out.println("Spring-boot Application has started !!!");
	}



}
