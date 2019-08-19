package org.lanqiao.jd.controller;

import org.lanqiao.jd.entity.Cartdetail;
import org.lanqiao.jd.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
