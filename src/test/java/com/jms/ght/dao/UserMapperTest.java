package com.jms.ght.dao;

import com.jms.ght.BaseTest;
import com.jms.ght.mapper.UserMapper;
import com.jms.ght.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUser() {
        String username = "name";
        String password = "pwd";
        for (int i = 0; i < 10; i++) {
            userMapper.addUser(new User(username + i, password + i));
        }
    }

    @Test
    public void findUserById() {
        User user = userMapper.queryUserById(2);
        System.out.println(user);
    }

    @Test
    public void findUserByName() {
        User user = userMapper.queryUserByName("root");
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        userMapper.updateUserById(new User(5, "root", "admin"));
    }

    @Test
    public void findAll() {
        List<User> users = userMapper.queryUsers(0,3);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void deleteUser() {
        userMapper.deleteUserById(11);
    }

}
