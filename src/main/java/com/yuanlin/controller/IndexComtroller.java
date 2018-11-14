package com.yuanlin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexComtroller {
    @RequestMapping("/")
    public Object test1(HttpSession session){
        Object test = session.getAttribute("test");
        if(test==null){
            session.setAttribute("test","1" );
            return "1";
        }
        session.setAttribute("test","1"+test );
        return test;
    }
}
