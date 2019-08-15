package org.lanqiao.jd.controller;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.jd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public String selectByLogin( String userName,  String userPassword){
        String resultUserName = loginService.selectByLogin(userName,userPassword);
        return resultUserName;
    }

}
