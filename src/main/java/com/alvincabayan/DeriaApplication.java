package com.alvincabayan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = { "com.alvincabayan", "com.alvincabayan.api"})
public class DeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeriaApplication.class, args);
	}

}
