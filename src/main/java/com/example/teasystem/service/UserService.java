package com.example.teasystem.service;

import com.example.teasystem.entity.*;


import java.util.ArrayList;

/**
 * 关于用户的接口类
 */
public interface UserService {
    /**
     * 实现登录验证
     * @param account 账号
     * @param password 密码
     * @return  返回ArrayList<User></>
     */
    ArrayList<User> selectUser(String account, String password);

    /**
     * 实现角色判断
     * @param userId 用户Id
     * @return 返回角色id
     */
    ArrayList<UserRole> selectUserRole(String userId);

    /**
     * 权限查询（根据角色Id）
     * @param roleId
     * @return Permission
     */
    ArrayList<Permission> selectPermission(String roleId);

    /**
     * 子权限查询（根据权限Id）
     * @param perId
     * @return Permission
     */
    ArrayList<Permission> selectPermissionSon(String perId);
}
