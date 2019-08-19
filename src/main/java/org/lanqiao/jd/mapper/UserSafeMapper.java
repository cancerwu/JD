package org.lanqiao.jd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lanqiao.jd.entity.UserSafe;

@Mapper
public interface UserSafeMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserSafe record);

    int insertSelective(UserSafe record);

    UserSafe selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserSafe record);

    int updateByPrimaryKey(UserSafe record);

    String selectByUserName(String userinput,String userPassword);

    String selectByUserTel(String userinput,String userPassword);

    String selectByUserEmail(String userinput,String userPassword);

    int sameTel(String userTel);
    int sameName(String userName);

    int selectUserId(String userName);
}