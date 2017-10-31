package com.javaonthecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientRandomSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRandomSentenceApplication.class, args);
	}
}
