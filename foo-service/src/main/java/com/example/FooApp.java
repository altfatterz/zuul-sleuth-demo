package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Zoltan Altfatter
 */
@EnableZuulProxy
@SpringBootApplication
public class FooApp {

    public static void main(String[] args) {
        SpringApplication.run(FooApp.class, args);
    }

}
