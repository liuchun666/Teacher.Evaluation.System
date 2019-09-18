package com.example.teasystem.controller;

import com.example.teasystem.entity.Permission;
import com.example.teasystem.entity.Role;
import com.example.teasystem.entity.User;
import com.example.teasystem.entity.UserRole;
import com.example.teasystem.mapper.UserMapper;
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
        ArrayList<User> users =  userServiceImpl.selectUser(account,password);
        if(users.size() == 1){
            System.out.print(".........");
           ArrayList<UserRole> roles =  userServiceImpl.selectUserRole(String.valueOf(users.get(0).getUserId()));
           if (roles.get(0).getRoleId() ==2){
               ArrayList<Permission> permissions = userServiceImpl.selectPermission(String.valueOf(roles.get(0).getRoleId()));
               for(int i = 0;i<=permissions.size()-1;i++){
                   System.out.print(permissions.size());
                   ArrayList<String> ps = new ArrayList<String>();
                   ps.add(permissions.get(i).getPerName());
                   System.out.print(permissions.get(i).getPerName());
               }
           }
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
