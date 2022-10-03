package com.example.mvcstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MvcStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcStartApplication.class, args);
    }

}
