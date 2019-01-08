package com.atguigu.gmall.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("userList")
    @ResponseBody
    public  String userList(){

        return "userList";
    }
}
