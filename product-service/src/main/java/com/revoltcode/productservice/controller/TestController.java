package com.revoltcode.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // whenever a controller annotated with this bean is called, it refreshes that particular bean
@RequestMapping("/api/v1/test")
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping("/")
    public String test(){
        return name;
    }
}
