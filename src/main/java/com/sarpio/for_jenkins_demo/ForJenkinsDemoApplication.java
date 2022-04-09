package com.sarpio.for_jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ForJenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForJenkinsDemoApplication.class, args);
    }


    @GetMapping
    public String get() {
        return "Hello Mr. Jenkins";
    }
}
