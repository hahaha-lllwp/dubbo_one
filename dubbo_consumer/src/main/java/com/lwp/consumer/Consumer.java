package com.lwp.consumer;

import com.lwp.api.SayHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        SayHelloService SayHelloService = (SayHelloService) context.getBean("sayHelloService"); // get remote service proxy
        String hello = SayHelloService.sayHello("小明");
        System.out.println(hello);

    }
}
