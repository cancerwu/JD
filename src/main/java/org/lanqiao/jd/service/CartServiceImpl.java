package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Cart;
import org.lanqiao.jd.entity.Cartdetail;
import org.lanqiao.jd.mapper.CartMapper;
import org.lanqiao.jd.mapper.CartDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartDetailMapper cartdetailMapper;
    @Autowired
    CartMapper cartMapper;

    @Override
    public int insertSelective(Cartdetail record) {
        return cartdetailMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(Cart cart) {
        return cartMapper.insertSelective(cart);
    }

    @Override
    public int selectByForKey(Integer user_id) {
        return cartMapper.selectByForKey(user_id);
    }
}
