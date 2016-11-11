package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @author Zoltan Altfatter
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinApp {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApp.class, args);
    }
}
