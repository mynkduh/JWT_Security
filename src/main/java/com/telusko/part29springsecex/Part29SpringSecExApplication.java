package com.telusko.part29springsecex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class Part29SpringSecExApplication {

    public static void main(String[] args) {
        SpringApplication.run(Part29SpringSecExApplication.class, args);
    }
}
