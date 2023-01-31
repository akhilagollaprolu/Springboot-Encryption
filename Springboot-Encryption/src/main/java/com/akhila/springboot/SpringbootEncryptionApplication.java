package com.akhila.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Scanner;

@SpringBootApplication
public class SpringbootEncryptionApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the raw password: ");
		String rawPassword = sc.nextLine();
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println("Encoded password: " + encodedPassword);
		boolean matches = encoder.matches(rawPassword, encodedPassword);
		System.out.println("Password matches: " + matches);






	}

}
