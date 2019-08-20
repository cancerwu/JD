package org.lanqiao.jd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Cart;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer cart_id);

    int insert(Cart record);

    int insertSelective(Cart cart);

    Cart selectByPrimaryKey(Integer cart_id);

    int selectByForKey(Integer user_id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}