package com.example.teasystem.service.impl;

import com.example.teasystem.entity.*;
import com.example.teasystem.mapper.AdminMapper;
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
    AdminMapper adminMapper;
    @Override
    public ArrayList<User> selectUser(String account, String password) {
        ArrayList<User> users = adminMapper.selectUser(account, password);
        return  users;
    }

    @Override
    public ArrayList<UserRole> selectUserRole(String userId) {
        ArrayList<UserRole> userRoles = adminMapper.selectUserRole(userId);
        return userRoles;
    }

    @Override
    public ArrayList<Permission> selectPermission(String roleId) {
        ArrayList<Permission> Permissions = adminMapper.selectPermission(roleId);
        return Permissions;
    }

    @Override
    public ArrayList<Permission> selectPermissionSon(String perId) {
        ArrayList<Permission> Permissions = adminMapper.selectPermissionSon(perId);
        return null;
    }
    @Override
    public int addUser(User user) {
        int i = adminMapper.addUser(user);
        return 0;
    }

    @Override
    public int deleteUser(String account) {
        int i=adminMapper.deleteUser(account);
        return i;
    }

    @Override
    public int updateUser(User user) {
        int i= adminMapper.updateUser(user);
        return i;
    }

}
