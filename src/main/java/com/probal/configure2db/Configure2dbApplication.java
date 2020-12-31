package com.probal.configure2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "com.probal.configure2db.*" })
public class Configure2dbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Configure2dbApplication.class, args);
    }

}
