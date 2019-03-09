package com.example.cxf_rs.service.impl;

import com.example.cxf_rs.commservice.ActionService;
import com.example.cxf_rs.service.HelloService1;
import com.example.cxf_rs.util.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl1 implements HelloService1 {

    @Autowired
    private ActionService actionService;

    @Override
    public String sayHello(String string) {
        ActionService bean = SpringUtils.getBean(ActionService.class);
        String info = bean.getInfo("hello");
        System.out.println("SayHello1:" + string);
        return "SayHello1:" + string;
    }
}
