package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.UserSafe;
import org.lanqiao.jd.mapper.UserSafeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserSafeMapper userSafeMapper;

    @Override
    public int insertUser(UserSafe userSafe) {
        userSafeMapper.insert(userSafe);
        return 0;
    }

    @Override
    public int checkSamePhone(String userTel) {
        return userSafeMapper.sameTel(userTel);
    }

    @Override
    public int checkSameName(String userName) {
        return userSafeMapper.sameName(userName);
    }
}
