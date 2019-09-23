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
      * 删除用户（根据用户名）
      * @param account
      * @return
      */
     int deleteUser(String account);

     /**
      * 修改用户信息
      * @param User
      * @return
      */
     int updateUser(User User);

    /**
     * 查询用户（模糊查询)
     * @param keyPass
     * @return Permission
     */
    ArrayList<User> selectUsers(String keyPass);



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
      * 添加院系
      * @param deptName
      * @return 1/0
      */
    int addDepartment(String deptName);

     /**
      * 删除院系
      * @param deptId
      * @return
      */
     int deleteDepartment(String deptId);

     /**
      * 查询院系
      * @param deptName
      * @return
      */
     ArrayList<Departments> selectDepartments(String deptName);

     /**
      * 修改院系
      * @param departments
      * @return
      */
     int updataDepartment(Departments departments);

     /**
      * 添加角色
      * @param roleNmame
      * @return 1/0
      */
     int addRole(String roleNmame);

     /**
      * 删除角色
      * @param roleId
      * @return
      */
     int deleteRole(String roleId);

     /**
      * 查询角色（模糊查询）
      * @param roleNmame
      * @return
      */
     ArrayList<Role> selectRole(String roleNmame);

     /**
      * 修改院系
      * @param role
      * @return
      */
     int updataRole(Role role);


}
