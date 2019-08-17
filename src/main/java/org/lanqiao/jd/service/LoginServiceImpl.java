package org.lanqiao.jd.service;

import org.lanqiao.jd.mapper.UserSafeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    UserSafeMapper userSafeMapper;

    @Override
    public String selectByLogin(String userinput, String userPassword) {
        String result="";

        String tel_reg ="^1[0-9]{10}$";
        String email_reg = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        String userName_reg = "^[a-zA-z]\\w{3,15}$";

        Pattern pattern1 = Pattern.compile(userName_reg);
        Matcher matcher1 = pattern1.matcher(userinput);

        Pattern pattern2 = Pattern.compile(tel_reg);
        Matcher matcher2 = pattern2.matcher(userinput);

        Pattern pattern3 = Pattern.compile(email_reg);
        Matcher matcher3 = pattern3.matcher(userinput);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

        if(matcher1.matches()){

             result = userSafeMapper.selectByUserName(userinput,userPassword);
        }
        else if(matcher2.matches()){
             result = userSafeMapper.selectByUserTel(userinput,userPassword);
        }
        else if(matcher3.matches()){
             result = userSafeMapper.selectByUserEmail(userinput,userPassword);
            System.out.println(result);
        }
        else{
            result="error";
        }
        return result;
    }
}
