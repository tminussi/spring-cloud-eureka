package com.javaonthecloud.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thales on 01/11/17.
 */
@Component
public class SentenceGeneratorService {

    private final AuthorClient authorClient;

    private final SentenceClient sentenceClient;

    @Autowired
    public SentenceGeneratorService(AuthorClient authorClient, SentenceClient sentenceClient) {
        this.authorClient = authorClient;
        this.sentenceClient = sentenceClient;
    }

    @HystrixCommand(fallbackMethod = "getSentenceFromHystrisx")
    public String generateSentence() {
        return "Sentence: " + this.sentenceClient.getSentence() + ". Author: " + this.authorClient.getAuthor();
    }

    public String getSentenceFromHystrix() {
        return "One of our services is down at the moment. Hystrix is protecting your app from crashing.";
    }
}
