package org.lwp.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwp.api.DemoObject;
import com.lwp.api.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = {"org.lwp.controller"})
public class ConsumerApplication {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @PostConstruct
    public void init() {
        DemoObject demoObject = new DemoObject();
        demoObject.setName("小红");
        demoObject.setMessage("hhhhhha");
        demoObject.setSalary(32231.123);
        String sayHello = demoService.printMessage(demoObject);
        System.err.println(sayHello);
    }
}
