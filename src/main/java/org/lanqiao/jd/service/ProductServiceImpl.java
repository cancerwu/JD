package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Product;
import org.lanqiao.jd.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductMapper productMapper;

    @Override
    public Product selectByPrimaryKey(Integer pro_id) {
        return productMapper.selectByPrimaryKey(pro_id);
    }
}


