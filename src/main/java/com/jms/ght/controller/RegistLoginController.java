package com.jms.ght.controller;

import com.alibaba.fastjson.JSON;
import com.jms.ght.pojo.User;
import com.jms.ght.service.UserService;
import com.jms.ght.utils.JSONResult;
import com.jms.ght.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RegistLoginController {

    private UserService userService;

    @Autowired
    public RegistLoginController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/regist")
    @ResponseBody
    public String test(@RequestBody String data) throws Exception {
        // 1、判断用户名和密码状态
        if((!StringUtils.isEmpty(data))) {
            Map user = (Map) JSON.parse(data);
            String username = (String) user.get("username");
            String password = (String) user.get("password");
            if((StringUtils.isEmpty(username)) || (StringUtils.isEmpty(password))) {
                return JSONResult.errorMsg("用户名或密码不能为空");
            }

            // 2、判断用户名是否存在
            if(userService.queryUserIsExist(username)) {
                return JSONResult.errorMsg("用户名已存在");
            }

            // 3、保存用户
            userService.saveUser(new User(username, username, MD5Utils.getMD5Str(password)));
        }

        return JSONResult.ok();
    }

    @PostMapping(value = "/registtest")
    public String foo(@RequestBody String data) throws Exception {
        System.out.println(data);
        String result = "{\"username\":\"root\",\"password\":\"123\"}";
        return JSONResult.ok();
    }
}
