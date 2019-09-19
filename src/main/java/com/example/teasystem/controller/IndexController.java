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

    //管理员添加用户界面
    @RequestMapping("/addUser")
    public String addUser(){
        return "manage/admins/addUser";
    }

    //管理员添加角色界面
    @RequestMapping("/addRole")
    public String addRole(){
        return "manage/admins/addRole";
    }

    //管理员添加权限界面
    @RequestMapping("/addPermission")
    public String addPermission(){
        return "manage/admins/addPermission";
    }

    //管理员添加院系界面
    @RequestMapping("/addDepartment")
    public String addDepartment(){
        return "manage/admins/addDepartments";
    }

    //管理员添加班级界面
    @RequestMapping("/addClasses")
    public String addClasses(){
        return "manage/admins/addClasses";
    }

    //管理员添加课程界面
    @RequestMapping("/addCourse")
    public String addCourse(){
        return "manage/admins/addCourse";
    }

    //管理员添加指标选项界面
    @RequestMapping("/addIndicatorsSelects")
    public String addIndicatorsSelects(){
        return "manage/admins/addIndicatorsSelects";
    }

    //管理员添加指标界面
    @RequestMapping("/addIndicators")
    public String addIndicators(){
        return "manage/admins/addIndicators";
    }

    //管理员添加角色指标界面
    @RequestMapping("/addRoleIndicators")
    public String addRoleIndicators(){
        return "manage/admins/addRoleIndicators";
    }

    //管理员添加学期界面
    @RequestMapping("/addBatch")
    public String addBatch(){
        return "manage/admins/addBatch";
    }

    //管理员添加授课界面
    @RequestMapping("/addTeaching")
    public String addTeaching(){
        return "manage/admins/addTeaching";
    }

}
