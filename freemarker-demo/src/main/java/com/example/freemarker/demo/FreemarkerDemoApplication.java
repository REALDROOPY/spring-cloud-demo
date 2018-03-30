package com.example.freemarker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FreemarkerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerDemoApplication.class, args);
    }
}
