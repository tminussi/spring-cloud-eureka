package com.javaonthecloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class RandomSentenceController {

    @Value("${sentences}")
    private String sentences;

    @GetMapping("/")
    public String getSentences() {
        String[] sentencesArray = sentences.split(":");
        int i = (int)Math.round(Math.random() * (sentencesArray.length - 1));
        return sentencesArray[i];
    }
}
