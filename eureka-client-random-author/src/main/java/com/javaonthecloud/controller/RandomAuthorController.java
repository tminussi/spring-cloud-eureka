package com.javaonthecloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class RandomAuthorController {

    @Value("${authors}")
    private String authors;

    @GetMapping("/")
    public String getAuthors() {
        String[] authorsArray = authors.split(":");
        int i = (int)Math.round(Math.random() * (authorsArray.length - 1));
        return authorsArray[i];
    }
}
