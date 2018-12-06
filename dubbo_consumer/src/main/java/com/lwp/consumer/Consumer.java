package com.lwp.consumer;

import com.lwp.api.DemoObject;
import com.lwp.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService= (DemoService) context.getBean("demoService"); // get remote service proxy
        DemoObject demoObject = new DemoObject();
        demoObject.setMessage("hello");
        demoObject.setName("小明");
        demoObject.setSalary(99821.2);
        String hello = demoService.printMessage(demoObject);
        System.out.println(hello);

    }
}
