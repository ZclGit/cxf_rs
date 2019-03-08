package com.example.cxf_rs.service.impl;

import com.example.cxf_rs.service.HelloService2;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl2 implements HelloService2 {

    @Override
    public String sayHello(String string) {
        System.out.println("SayHello2:" + string);
        return "SayHello2:" + string;
    }
}
