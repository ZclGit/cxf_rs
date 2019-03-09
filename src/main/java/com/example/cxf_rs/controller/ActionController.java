package com.example.cxf_rs.controller;

import com.example.cxf_rs.commservice.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("action")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping("getInfo")
    public void getInfo(String str) {
        System.out.println(actionService.getInfo(str));
    }
}
