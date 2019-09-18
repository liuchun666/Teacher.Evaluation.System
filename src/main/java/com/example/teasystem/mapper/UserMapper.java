package com.example.teasystem.mapper;

import com.example.teasystem.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.ArrayList;

public interface UserMapper {
     ArrayList<User> selectUser(String account, String password);
     int insertUser(User user);
     ArrayList<UserRole> selectUserRole(int userId);
     ArrayList<Permission> selectPermission(int roleId);


}
