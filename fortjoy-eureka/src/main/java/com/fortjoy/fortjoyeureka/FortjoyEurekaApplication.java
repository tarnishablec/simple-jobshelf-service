package com.fortjoy.fortjoyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FortjoyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortjoyEurekaApplication.class, args);
    }

}
