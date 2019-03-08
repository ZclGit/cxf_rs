package com.example.cxf_rs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("gotoMenu")
    public String gotoMenu() {
        return "redirect:static/html/index.html";
    }
}
