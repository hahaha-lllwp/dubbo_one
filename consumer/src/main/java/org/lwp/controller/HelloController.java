package org.lwp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwp.api.DemoObject;
import com.lwp.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello(String name){
        DemoObject demoObject = new DemoObject();
        demoObject.setName(name);
        demoObject.setSalary(12003.1231);
        demoObject.setMessage("Hi");
        return demoService.printMessage(demoObject);
    }
}
