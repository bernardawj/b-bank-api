package com.bernardawj.bbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:message.properties")
public class BBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BBankApplication.class, args);
    }

}
