package org.lwp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwp.api.SayHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private SayHelloService sayHelloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return sayHelloService.sayHello(name);
    }
}
