package com.eazybytes.school;

import org.apache.catalina.users.DataSourceUserDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EazybytesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazybytesApplication.class, args);
	}

}
