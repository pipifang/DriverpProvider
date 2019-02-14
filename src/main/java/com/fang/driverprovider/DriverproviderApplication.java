package com.fang.driverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DriverproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverproviderApplication.class, args);
    }

}

