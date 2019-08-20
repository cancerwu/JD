package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Cart;
import org.lanqiao.jd.entity.Cartdetail;
import org.springframework.stereotype.Repository;

@Repository
public interface CartService {
    int insertSelective(Cartdetail record);
    int insertSelective(Cart cart);
    int selectByForKey(Integer user_id);
}
