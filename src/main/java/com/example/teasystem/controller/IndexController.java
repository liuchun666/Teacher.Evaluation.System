package com.example.teasystem.controller;

import com.example.teasystem.entity.Permission;
import com.example.teasystem.entity.User;
import com.example.teasystem.entity.UserRole;
import com.example.teasystem.service.impl.UserServiceImpl;
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
public class IndexController {
    @Autowired
    UserServiceImpl userServiceImpl;

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
        ArrayList<User> users = userServiceImpl.selectUser(account, password);
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
     * 返回登陆界面
     *
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        return "manage/login";
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
        ArrayList<UserRole> roles = userServiceImpl.selectUserRole(userId);
        if (roles.get(0).getRoleId() != null) {
            permissions = userServiceImpl.selectPermission(String.valueOf(roles.get(0).getRoleId()));
            return permissions;
        } else {
           return  null;
        }
    }
}