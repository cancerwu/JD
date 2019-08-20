package org.lanqiao.jd.controller;

import org.lanqiao.jd.entity.Cart;
import org.lanqiao.jd.entity.Cartdetail;
import org.lanqiao.jd.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/insertCart")
    public int insertSelective(Cartdetail record) {
        return cartService.insertSelective(record);
    }
    @RequestMapping("/insertCar")
    public int insertSelective(Cart cart) {
        return cartService.insertSelective(cart);
    }
    @RequestMapping("/getcart")
    public int selectByPrimaryKey(Integer cart_id) {
        return cartService.selectByForKey(cart_id);
    }

}
