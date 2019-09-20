package com.example.teasystem.service.impl;

import com.example.teasystem.entity.*;
import com.example.teasystem.mapper.AdminMapper;
import com.example.teasystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**  登录实现类
 * @author maolei
 * @date 2019/9/17
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
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
        return Permissions;
    }

    @Override
    public int addDepartment(String deptName) {
        int reg = adminMapper.addDepartment(deptName);
        return reg;
    }

    @Override
    public int deleteDepartment(String deId) {
        int reg = adminMapper.deleteDepartment(deId);
        return reg;
    }

    @Override
    public ArrayList<Departments> selectDepartments(String deptName) {
        ArrayList<Departments> departments = adminMapper.selectDepartments(deptName);
        return departments;
    }

    @Override
    public int updataDepartment(String deId) {
        int reg = adminMapper.updataDepartment(deId);
        return reg;
    }

    @Override
    public int addRole(String roleName) {
        int reg = adminMapper.addRole(roleName);
        return reg;
    }

    @Override
    public int deleteRole(String roleId) {
        int reg = adminMapper.deleteRole(roleId);
        return reg;
    }

    @Override
    public ArrayList<Role> selectRole(String roleNmame) {
        ArrayList<Role> departments = adminMapper.selectRole(roleNmame);
        return  departments;
    }

    @Override
    public int updataRole(String roleId) {
        int reg = adminMapper.updataRole(roleId);
        return reg;
    }
    @Override
    public int insertUser(User user) {
        int reg = adminMapper.insertUser(user);
        return reg;
    }

    @Override
    public int deleteUser(String account) {
        int reg=adminMapper.deleteUser(account);
        return reg;
    }

    @Override
    public int updateUser(User user) {
        int reg= adminMapper.updateUser(user);
        return reg;
    }

}
