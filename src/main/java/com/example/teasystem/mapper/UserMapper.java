package com.example.teasystem.mapper;
import com.example.teasystem.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UserMapper {
     ArrayList<User> selectUser(@Param("account") String account, @Param("password") String password);
     ArrayList<UserRole> selectUserRole(String userId);
     int insertUser(User user);
     ArrayList<Permission> selectPermission(String roleId);


}
