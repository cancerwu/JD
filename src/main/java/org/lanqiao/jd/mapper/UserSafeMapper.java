package org.lanqiao.jd.mapper;

import org.lanqiao.jd.entity.UserSafe;

public interface UserSafeMapper {
    int deleteByPrimaryKey(Integer uesrId);

    int insert(UserSafe record);

    int insertSelective(UserSafe record);

    UserSafe selectByPrimaryKey(Integer uesrId);

    int updateByPrimaryKeySelective(UserSafe record);

    int updateByPrimaryKey(UserSafe record);

    String selectByLogin(String userName,String userPassword);
}