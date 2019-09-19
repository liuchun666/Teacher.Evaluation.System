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
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 谭舟耀
 */
@SuppressWarnings("ALL")
@Controller
public class IndexController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping("/index")
    public ModelAndView toIndex(String account, String password){
        Map<String,Object> map = new HashMap<>();
        String nextView;
        ArrayList<Permission> ps = new ArrayList<Permission>();;
        ArrayList<User> users =  userServiceImpl.selectUser(account,password);
        if(users.size() == 1){
           ArrayList<UserRole> roles =  userServiceImpl.selectUserRole(String.valueOf(users.get(0).getUserId()));
           if (roles.get(0).getRoleId() ==2){
               ArrayList<Permission> permissions = userServiceImpl.selectPermission(String.valueOf(roles.get(0).getRoleId()));
               for(int i = 0;i<=permissions.size()-1;i++){
                   ps.add(permissions.get(i));
                   System.out.print(permissions.get(i).getPerName());
               }
               map.put("permissions",ps);
           }
           nextView =  "manage/index";
        }else{
            System.out.print("登录失败");
            nextView ="error";
        }
        ModelAndView modelAndView = new ModelAndView(nextView);
        modelAndView.addAllObjects(map);
        return  modelAndView;
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "manage/login";
    }


}
