package com.example.teasystem.service.impl;

import com.example.teasystem.entity.*;
import com.example.teasystem.mapper.UserMapper;
import com.example.teasystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**  登录实现类
 * @author maolei
 * @date 2019/9/17
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper usermap;
    @Override
    public ArrayList<User> selectUser(String account, String password) {
        ArrayList<User> users = usermap.selectUser(account, password);
        return  users;
    }

    @Override
    public ArrayList<UserRole> selectUserRole(String userId) {
        ArrayList<UserRole> userRoles = usermap.selectUserRole(userId);
        return userRoles;
    }

    @Override
    public ArrayList<Permission> selectPermission(String roleId) {
        ArrayList<Permission> Permissions = usermap.selectPermission(roleId);
        return Permissions;
    }
}
