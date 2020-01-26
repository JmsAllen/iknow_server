package com.jms.ght.service.Impl;

import com.jms.ght.BaseTest;
import com.jms.ght.pojo.User;
import com.jms.ght.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryAll() {
        List<User> users = userService.queryAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
