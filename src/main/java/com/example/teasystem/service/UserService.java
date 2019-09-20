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

    /**
<<<<<<< HEAD
     * 添加院系
     * @param deptName
     * @return
     */
    int addDepartment(String deptName);
    /**
     * 添加院系
     * @param deId
     * @return
     */
    int deleteDepartment(String deId);

    /**
     * 查询院系（模糊查询）
     * @param deptName
     * @return
     */
    ArrayList<Departments> selectDepartments(String deptName);

    /**
     * 修改院系信息
     * @param deId
     * @return
     */
    int updataDepartment(String deId);

    /**
     * 添加角色信息
     * @param roleName
     * @return
     */
    int addRole(String roleName);

    /**
     * 删除角色信息
     * @param roleId
     * @return
     */
    int deleteRole(String roleId);

    /**
     * 查询角色信息
     * @param roleNmame
     * @return
     */
    ArrayList<Role> selectRole(String roleNmame);

    /**
     * 修改院系
     * @param roleId
     * @return
     */
    int updataRole(String roleId);
=======
     * 添加用户
     * @param user 用户值
     * @return int
     */
    int addUser(User user);

    /**
     * 删除用户
     * @param account account
     * @return int
     */
    int  deleteUser(String account);

    /**
     * 修改用户信息
     * @param user user
     * @return int
     */
    int updateUser(User user);
>>>>>>> origin/master


}
