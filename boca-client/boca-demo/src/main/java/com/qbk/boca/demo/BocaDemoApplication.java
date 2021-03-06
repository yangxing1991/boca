package com.qbk.boca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//支持feign
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BocaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BocaDemoApplication.class,args);
    }
}
