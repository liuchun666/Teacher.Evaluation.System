package com.example.teasystem.mapper;
import com.example.teasystem.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface AdminMapper {
     /**
      * 登陆查询（根据账号密码）
      * @param account
      * @param password
      * @return  User
      */
     ArrayList<User> selectUser(@Param("account") String account, @Param("password") String password);

     /**
      * 查询角色（根据用户Id）
      * @param userId
      * @return RoleId
      */
     ArrayList<UserRole> selectUserRole(String userId);

     /**
      * 添加用户
      * @param user
      * @return 1/0
      */
     int insertUser(User user);

     /**
      * 查询角色权限（根据角色Id)
      * @param roleId
      * @return Permission
      */
     ArrayList<Permission> selectPermission(String roleId);

     /**
      * 根据权限Id查询权限子功能
      * @param perId
      * @return  Permission
      */
     ArrayList<Permission> selectPermissionSon(String perId);

     /**
      * 添加用户
      * @param user user
      * @return int
      */
     int addUser(User user);

     /**删除用户
      * @param account account
      * @return int
      */
     int deleteUser(String account);

     /**修改用户信息
      * @param user user
      * @return int
      */
     int updateUser(User user);
}
