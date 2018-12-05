package org.lwp.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwp.api.SayHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ConsumerApplication {

	@Reference(version = "1.0.0")
  	private SayHelloService sayHelloService;

	public static void main(String[] args) {
		
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
    @PostConstruct
    public void init() {
    	String sayHello = sayHelloService.sayHello("world");
    	System.err.println(sayHello);
    }
}
