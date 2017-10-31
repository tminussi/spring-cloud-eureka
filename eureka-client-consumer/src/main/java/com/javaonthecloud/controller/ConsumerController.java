package com.javaonthecloud.controller;

import com.javaonthecloud.service.AuthorClient;
import com.javaonthecloud.service.SentenceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class ConsumerController {

    private final AuthorClient authorClient;

    private final SentenceClient sentenceClient;

    @Autowired
    public ConsumerController(AuthorClient authorClient, SentenceClient sentenceClient) {
        this.authorClient = authorClient;
        this.sentenceClient = sentenceClient;
    }

    @GetMapping("/give-me-something")
    public @ResponseBody
    String getSentence() {
        return generateSentence();
    }

    private String generateSentence() {
        return "Sentence: " + this.sentenceClient.getSentence() + ". Author: " + this.authorClient.getAuthor();
    }
}
