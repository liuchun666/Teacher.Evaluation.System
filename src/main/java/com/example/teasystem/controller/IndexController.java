package com.example.teasystem.controller;

import com.example.teasystem.entity.User;
import com.example.teasystem.entity.UserRole;
import com.example.teasystem.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author 谭舟耀
 */
@SuppressWarnings("ALL")
@Controller
public class IndexController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @RequestMapping("/index")
    public String toIndex(String account,String password){
        ArrayList<User> user =  userServiceImpl.selectUser(account,password);
        if(user.size()!=0){
            return "manage/index";
        }else{
            System.out.print("登录失败");
            return "error";
        }

    }

    @RequestMapping("/login")
    public String toLogin(){
        return "manage/login";
    }


}
