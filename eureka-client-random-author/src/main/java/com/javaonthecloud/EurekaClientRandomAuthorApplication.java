package com.javaonthecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientRandomAuthorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRandomAuthorApplication.class, args);
	}
}
