package com.jms.ght.service.Impl;

import com.jms.ght.mapper.UserMapper;
import com.jms.ght.pojo.User;
import com.jms.ght.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void addAUser(User user) {

    }

    @Override
    public void deleteAUserById(Integer id) {

    }

    @Override
    public void updateAUserById(User user) {

    }

    @Override
    public User queryAUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryUsers(3, 4);
    }
}
