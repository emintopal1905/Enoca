package com.enoca.Enoca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories //DB için gerekli Annotation
public class EnocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnocaApplication.class, args);
	}

}
