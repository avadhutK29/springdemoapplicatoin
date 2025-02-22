package com.avadhut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SampleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleDemoApplication.class, args);
    }

}
