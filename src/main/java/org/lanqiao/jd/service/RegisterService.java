package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.UserSafe;


public interface RegisterService {
    public int insertUser(UserSafe userSafe);

    public int checkSamePhone(String userTel);

    public int checkSameName(String userName);
}
