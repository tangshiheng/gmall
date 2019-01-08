package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userList")
    public List<UserInfo> userList(){
        List<UserInfo> userInfos = userService.getUserList();
        return userInfos;
    }

    @RequestMapping("userById")
    public UserInfo ByUserId(@RequestParam("id") String id){
        UserInfo userInfo = userService.ByUserId(id);
        return userInfo;
    }
}
