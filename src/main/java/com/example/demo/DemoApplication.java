package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}

//@Component -> Controller, Configuration, Repository, Service, RestController