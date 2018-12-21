package com.starlight.ms.datasite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DatasiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatasiteApplication.class, args);
    }

}

