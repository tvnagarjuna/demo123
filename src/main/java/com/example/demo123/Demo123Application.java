package com.example.demo123;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo123Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo123Application.class, args);
    }
    
    @GetMapping("/")
    public String home() {
        return "Java CI/CD is Working 🚀 Super kick";
    }
}