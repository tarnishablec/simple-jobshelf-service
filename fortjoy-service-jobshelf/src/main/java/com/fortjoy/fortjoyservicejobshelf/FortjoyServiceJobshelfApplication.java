package com.fortjoy.fortjoyservicejobshelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableDiscoveryClient
@EnableReactiveMongoRepositories
@SpringBootApplication
public class FortjoyServiceJobshelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortjoyServiceJobshelfApplication.class, args);
    }

}
