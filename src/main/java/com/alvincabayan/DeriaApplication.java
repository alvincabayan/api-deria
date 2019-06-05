package com.alvincabayan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.alvincabayan", "com.alvincabayan.api"})
public class DeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeriaApplication.class, args);
	}

}
