package com.zhao.controller;

import com.zhao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return helloService.sayHello( name + " , " );
    }

}
