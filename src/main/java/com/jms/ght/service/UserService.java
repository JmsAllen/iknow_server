package com.jms.ght.service;

import com.jms.ght.pojo.User;

import java.util.List;

public interface UserService {
    void addAUser(User user);
    void deleteAUserById(Integer id);
    void updateAUserById(User user);
    User queryAUserById(Integer id);
    List<User> queryAllUsers();
    boolean queryUserIsExist(String username) throws Exception;
    void saveUser(User user);
}
