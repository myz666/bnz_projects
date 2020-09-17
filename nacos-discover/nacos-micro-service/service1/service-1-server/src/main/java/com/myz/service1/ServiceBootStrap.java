package com.myz.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBootStrap.class, args);
    }

}
