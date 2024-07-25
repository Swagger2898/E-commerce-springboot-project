package com.sheryians.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
		
		
		
		 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        String rawPassword = "admin";
	        String encodedPassword = passwordEncoder.encode(rawPassword);

	        // Save the encoded password in the database
	        System.out.println("Encoded Password: " + encodedPassword);
	    }
	}
	


