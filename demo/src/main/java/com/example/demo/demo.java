package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo {
    @RequestMapping("/alo")
    public String master(){
        return "index";
    }
}
