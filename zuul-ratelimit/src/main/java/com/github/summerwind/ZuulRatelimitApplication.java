package com.github.summerwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xiasx
 * @create 2019-05-22 0:40
 **/
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulRatelimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulRatelimitApplication.class, args);
    }
}
