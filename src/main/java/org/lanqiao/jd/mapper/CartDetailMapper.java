package org.lanqiao.jd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Cartdetail;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CartDetailMapper {
    int deleteByPrimaryKey(Integer cart_detail_id);

    int insert(Cartdetail record);

    int insertSelective(Cartdetail record);

    Cartdetail selectByPrimaryKey(Integer cart_detail_id);

    int updateByPrimaryKeySelective(Cartdetail record);

    int updateByPrimaryKey(Cartdetail record);
}