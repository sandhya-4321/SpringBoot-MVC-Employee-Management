package com.SpringBootMvc_1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.SpringBootMvc")

@EnableJpaRepositories(basePackages = "com.SpringBootMvc.repo")

@EntityScan(basePackages = "com.SpringBootMvc.model")

public class SpringBootMvc1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMvc1Application.class, args);

        System.out.println("Start Spring Boot Application");
    }
}