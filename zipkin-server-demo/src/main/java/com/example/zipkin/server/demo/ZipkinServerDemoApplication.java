package com.example.zipkin.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerDemoApplication.class, args);
    }
}
