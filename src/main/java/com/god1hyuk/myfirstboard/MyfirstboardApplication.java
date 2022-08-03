package com.god1hyuk.myfirstboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyfirstboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstboardApplication.class, args);
	}

}
