package com.github.summerwind.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiasx
 * @create 2019-05-22 0:48
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping(value = "/test")
    public void orderTest() {
        System.out.println("good");
    }
}
