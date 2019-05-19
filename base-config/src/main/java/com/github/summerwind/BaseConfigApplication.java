package com.github.summerwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xiasx
 * @create 2019-05-19 17:28
 **/

@EnableConfigServer
@SpringBootApplication
public class BaseConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseConfigApplication.class);
    }
}
