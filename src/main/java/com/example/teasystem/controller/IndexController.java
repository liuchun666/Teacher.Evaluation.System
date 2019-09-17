package com.example.teasystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 谭舟耀
 */
@Controller
public class IndexController {
    @RequestMapping("/login")
    public String toLogin(){
        return "manage/index";
    }
}
