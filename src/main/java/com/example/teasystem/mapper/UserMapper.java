package com.example.teasystem.mapper;
import com.example.teasystem.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UserMapper {
     ArrayList<User> selectUser(@Param("username") String username, @Param("password") String password);
     ArrayList<UserRole> selectUserRole(int userId);
    int insertUser(User user);
     ArrayList<Permission> selectPermission(int roleId);


}
