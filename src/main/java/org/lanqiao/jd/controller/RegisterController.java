package org.lanqiao.jd.controller;

import org.lanqiao.jd.entity.UserSafe;
import org.lanqiao.jd.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

//    //设置请求路径
    @RequestMapping("/hello")
//    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/insertUser")
    public int insertUser(UserSafe userSafe){
        registerService.insertUser(userSafe);
        return 0;
    }
    @RequestMapping("/checkSamePhone")
    public int checkSamePhone(String userTel){
        return registerService.checkSamePhone(userTel);
    }

    @RequestMapping("/checkSameName")
    public int checkSameName(String userName){
        return registerService.checkSameName(userName);
    }
}
