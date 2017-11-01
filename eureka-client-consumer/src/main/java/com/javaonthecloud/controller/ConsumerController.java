package com.javaonthecloud.controller;

import com.javaonthecloud.service.SentenceGeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class ConsumerController {

    private final SentenceGeneratorService sentenceGeneratorService;

    public ConsumerController(SentenceGeneratorService sentenceGeneratorService) {
        this.sentenceGeneratorService = sentenceGeneratorService;
    }

    @GetMapping("/give-me-something")
    public String getSentence() {
        return this.sentenceGeneratorService.generateSentence();
    }

}
