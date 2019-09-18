package com.example.teasystem.service;

import com.example.teasystem.entity.User;
import com.example.teasystem.entity.UserRole;

import java.util.ArrayList;

/**
 * 关于用户的接口类
 */
public interface UserService {
    /**
     * 实现登录验证
     * @param username 账号
     * @param password 密码
     * @return  返回ArrayList<User></>
     */
    ArrayList<User> selectUser(String username, String password);

    /**
     * 实现角色判断
     * @param userId 用户Id
     * @return 返回角色id
     */
    ArrayList<UserRole> selectUserRole(int userId);
}
