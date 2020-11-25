package com.xu.web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller
public class WebController {
    @RequestMapping({"/","/index.html"})
    public String login(){
        return "index";
    }
    @RequestMapping("/success")
    public String method1(Map<String,Object> map){
        map.put("hello","你好");
        return  "success";
    }
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        return "list";
    }
}
