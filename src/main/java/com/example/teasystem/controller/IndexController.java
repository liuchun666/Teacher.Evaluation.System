package com.example.teasystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 谭舟耀
 */
@Slf4j
@Controller
public class IndexController {
    @RequestMapping("/login")
    public String toLogin(){
        return "manage/index";
    }

    @RequestMapping("/log")
    public String testLog(){
        log.info("#########  info 你好 #########");
        log.debug("#########  debug 不好#########");
        log.error("#########  error  糟糕#########");
        return "manage/index";
    }

}
