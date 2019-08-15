package org.lanqiao.jd.service;

import org.lanqiao.jd.mapper.UserSafeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    UserSafeMapper userSafeMapper;

    @Override
    public String selectByLogin(String userName, String userPassword) {

        String resultUserName = userSafeMapper.selectByLogin(userName,userPassword);
        return resultUserName;
    }
}
