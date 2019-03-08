package com.example.cxf_rs.service.impl;

import com.example.cxf_rs.service.HelloService1;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl1 implements HelloService1 {

    @Override
    public String sayHello(String string) {
        System.out.println("SayHello1:" + string);
        return "SayHello1:" + string;
    }
}
