package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Cartdetail;
import org.lanqiao.jd.mapper.CartdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartdetailMapper cartdetailMapper;

    @Override
    public int insertSelective(Cartdetail record) {
        return cartdetailMapper.insertSelective(record);
    }
}
