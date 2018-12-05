package com.lwp.provider;

import com.lwp.api.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String name) {
        return "Hello " + name + " !";
    }
}
