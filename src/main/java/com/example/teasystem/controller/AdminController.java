package com.example.teasystem.controller;


import com.example.teasystem.entity.*;
import com.example.teasystem.service.impl.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 谭舟耀
 */
@Slf4j
@SuppressWarnings("ALL")
@Controller
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    AdminServiceImpl adminServiceImpl;

    /**
     * 返回登陆界面
     *
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        return "manage/login";
    }


    /**
     * 登陆处理
     *
     * @param account
     * @param password
     * @return 主界面
     */
    @RequestMapping("/index")
    public ModelAndView toIndex(String account, String password) {
        Map<String, Object> map = new HashMap<>();
        String nextView;
        ArrayList<User> users = adminServiceImpl.selectUser(account, password);
        if (users.size() == 1) {
            map.put("users", users.get(0));
            nextView = "manage/index";
        } else {
            System.out.print("登录失败");
            nextView = "error";
        }
        ModelAndView modelAndView = new ModelAndView(nextView);
        modelAndView.addAllObjects(map);
        return modelAndView;
    }


    /**
     * 返回权限Ajax
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectPerAjax")
    public ArrayList<Permission> selectPerAjax(String userId) {

        ArrayList<Permission> permissions = new ArrayList<>();
        ArrayList<UserRole> roles = adminServiceImpl.selectUserRole(userId);
        if (roles.get(0).getRoleId() != null) {
            permissions = adminServiceImpl.selectPermission(String.valueOf(roles.get(0).getRoleId()));
            return permissions;
        } else {
           return  null;
        }
    }

    /**
     * 添加用户
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/insetUser")
    public boolean insetUser(User user) {
        int reg = adminServiceImpl.insertUser(user);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 删除用户
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/insetUser")
    public boolean deleteUser(String userId) {
        int reg = adminServiceImpl.deleteUser(userId);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 模糊查询院系
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("selectUsers")
    public ArrayList<User> selectUsers(String keypass) {
        ArrayList<User> users = adminServiceImpl.selectUsers(keypass);
        return users;
    }

    /**
     * 修改用户
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/insetUser")
    public boolean updataUser(User user) {
        int reg = adminServiceImpl.updateUser(user);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 添加院系
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/insetDept")
    public boolean addDept(String deptName) {
        int reg = adminServiceImpl.addDepartment(deptName);

        if(reg > 0){
           return true;
        }else{
            return false;
        }
    }

    /**
     * 模糊查询院系
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("seleteDept")
    public ArrayList<Departments> selectDept(String deptName) {
        ArrayList<Departments> departments = adminServiceImpl.selectDepartments(deptName);
       return departments;
    }

    /**
     * 删除院系
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteDept")
    public boolean deleteDept(String deId) {
        int reg = adminServiceImpl.deleteDepartment(deId);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 修改院系
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/updataDept")
    public boolean updataDept(Departments departments) {
        int reg = adminServiceImpl.updataDepartment(departments);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 添加角色
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/insetRole")
    public boolean insetRole(String roleName) {
        int reg = adminServiceImpl.addRole(roleName);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 删除角色
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteDept")
    public boolean deleteRole(String roleId) {
        int reg = adminServiceImpl.deleteRole(roleId);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 模糊查询角色
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("seleteRole")
    public ArrayList<Role> seleteRole(String roleName) {
        ArrayList<Role> roles = adminServiceImpl.selectRole(roleName);
        return roles;
    }

    /**
     * 修改角色
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/updataRole")
    public boolean updataRole(Role role) {
        int reg = adminServiceImpl.updataRole(role);
        if(reg > 0){
            return true;
        }else{
            return false;
        }
    }
}