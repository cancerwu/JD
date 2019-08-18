package org.lanqiao.jd.controller;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.jd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.nio.channels.SeekableByteChannel;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public String selectByLogin(String userinput, String userPassword, HttpServletRequest request){
        HttpSession session = request.getSession();

        String resultUserName = loginService.selectByLogin(userinput,userPassword);
        session.setAttribute("userName",resultUserName);
        System.out.println("---------"+session.getAttribute("userName"));
        return resultUserName;
    }

    @PostMapping("/getLoginUserName")
    public String getLoginUserName(HttpServletRequest request){
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");
        return userName;
    }


}
