package com.example.cxf_rs.commservice;

import org.springframework.stereotype.Service;

@Service
public class ActionService {
    public String getInfo(String str) {
        return "feedback: " + str;
    }
}
