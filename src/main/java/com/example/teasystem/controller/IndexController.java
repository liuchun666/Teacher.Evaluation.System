package com.example.teasystem.controller;

import com.example.teasystem.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/login")
   public String toLogin(){
        return "login";
    }
}
