package org.lanqiao.jd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(Integer pro_id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pro_id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectAllProductKBE();
}