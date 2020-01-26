package com.jms.ght.mapper;

import org.apache.ibatis.annotations.Param;
import com.jms.ght.pojo.User ;

import java.util.List;

public interface UserMapper {
    void addUser(User user);
    void deleteUserById(Integer id);
    void updateUserById(User user);
    User queryUserById(Integer id);
    List<User> queryUsers(@Param("offset") int offset, @Param("limit") int limit);
}
