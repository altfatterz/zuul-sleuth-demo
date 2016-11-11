package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zoltan Altfatter
 */
@SpringBootApplication
@RestController
@Slf4j
public class BarApp {

    public static void main(String[] args) {
        SpringApplication.run(BarApp.class, args);
    }

    @GetMapping
    public String greeting() {
        log.info("greeting called...");
        return "Hello World";
    }
}
