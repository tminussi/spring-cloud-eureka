package com.javaonthecloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class RandomAuthorController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${authors}")
    private String authors;

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getAuthors() {
        System.out.println("System port: " + environment.getProperty("local.server.port"));
        String[] authorsArray = authors.split(":");
        int i = (int)Math.round(Math.random() * (authorsArray.length - 1));
        logger.info("{}", i);
        return authorsArray[i];
    }
}
