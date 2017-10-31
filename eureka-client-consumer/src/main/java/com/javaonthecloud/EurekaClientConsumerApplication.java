package com.javaonthecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
=======
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
>>>>>>> b8c1d8d5a4ce139a44e7b410ff117c1f10397452
public class EurekaClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumerApplication.class, args);
	}
<<<<<<< HEAD
=======

	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
    }
>>>>>>> b8c1d8d5a4ce139a44e7b410ff117c1f10397452
}
