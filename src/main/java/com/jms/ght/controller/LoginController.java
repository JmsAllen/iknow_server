package com.jms.ght.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @PostMapping(value = "/regist", produces="application/json;charset=utf-8")
    public String test(@RequestBody String data) {

        if(!StringUtils.isEmpty(data)) {
            Map maps = (Map) JSON.parse(data);
            String username = (String) maps.get("username");
            String password = (String) maps.get("password");
            System.out.printf("username is %s, password is %s\n", username, password);
            return "成功接收参数";
        }
        return "连接成功，但参数未接收";
    }
}
