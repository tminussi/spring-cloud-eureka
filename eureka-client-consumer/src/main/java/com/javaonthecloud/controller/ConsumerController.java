package com.javaonthecloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class ConsumerController {

    private final DiscoveryClient discoveryClient;

    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerController(DiscoveryClient discoveryClient, RestTemplate restTemplate) {
        this.discoveryClient = discoveryClient;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/give-me-something")
    public @ResponseBody
    String getSentence() {
        StringBuilder stringBuilder =
                new StringBuilder()
                .append(generate("SENTENCE-GENERATOR"))
                .append(System.lineSeparator())
                .append("Author: ")
                .append(generate("AUTHOR-GENERATOR"));
        return stringBuilder.toString();
    }

    private String generate(String service) {
        List<ServiceInstance> instances = discoveryClient.getInstances(service);
        URI uri = instances.stream().findAny().get().getUri();
        return this.restTemplate.getForObject(uri,String.class);
    }
}
