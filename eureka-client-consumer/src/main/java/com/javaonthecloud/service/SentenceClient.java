package com.javaonthecloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by thales on 31/10/17.
 */
@FeignClient("api-gateway/")
public interface SentenceClient {

    @GetMapping(value = "sentence-generator", consumes = "application/json")
    String getSentence();

}
