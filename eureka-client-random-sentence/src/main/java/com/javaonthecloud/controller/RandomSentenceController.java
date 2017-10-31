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
<<<<<<< HEAD
        System.out.println(sentences);
=======
>>>>>>> b8c1d8d5a4ce139a44e7b410ff117c1f10397452
        String[] sentencesArray = sentences.split(":");
        int i = (int)Math.round(Math.random() * (sentencesArray.length - 1));
        return sentencesArray[i];
    }
}
