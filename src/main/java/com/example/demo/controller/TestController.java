package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 123
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
