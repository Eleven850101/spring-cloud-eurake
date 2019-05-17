package com.github.summerwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiasx
 * @create 2019-05-17 23:36
 **/

@EnableEurekaServer
@SpringBootApplication
public class BaseRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseRegistryApplication.class);
    }
}
