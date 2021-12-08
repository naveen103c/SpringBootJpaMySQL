package com.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootJpaMySqlApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		String sql = "INSERT INTO STUDENT (age,email,name) VALUES(28,'naveen @gmail.com', 'Naveen')";
		int result = jdbcTemplate.update(sql);
		if (result > 0) {
			System.out.println("A new row has been inserted.");
		}
		*/
	}

}
