package com.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestSbRameshfApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSbRameshfApplication.class, args);
	}

}
