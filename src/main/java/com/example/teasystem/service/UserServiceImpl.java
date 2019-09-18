package com.example.teasystem.service;

import com.example.teasystem.entity.User;
import com.example.teasystem.entity.UserRole;
import com.example.teasystem.mapper.UserMapper;
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
    public ArrayList<User> selectUser(String username, String password) {
        ArrayList<User> users = usermap.selectUser(username, password);
        return users;
    }

    @Override
    public ArrayList<UserRole> selectUserRole(int userId) {
        ArrayList<UserRole> userRoles = usermap.selectUserRole(userId);
        return userRoles;
    }
}
