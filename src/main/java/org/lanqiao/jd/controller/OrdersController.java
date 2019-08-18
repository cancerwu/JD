package org.lanqiao.jd.controller;


import org.lanqiao.jd.entity.AllOrdersInfo;
import org.lanqiao.jd.entity.Orders;
import org.lanqiao.jd.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping

public class OrdersController {
    @Autowired
    private OrdersService ordersService;

//    @CrossOrigin
//    @RequestMapping("selectAddress/{order_id}")
//    public UserAddress selectAddress(@PathVariable Integer order_id){return ordersService.selectAddress(order_id);}
    @CrossOrigin
    @RequestMapping("selectAll/{order_id}")
    public List<AllOrdersInfo> selectAll(@PathVariable Integer order_id){return ordersService.selectAll(order_id);}
    @CrossOrigin
    @RequestMapping("AOrder")
    public int AOrder( Orders orders){return ordersService.updataOrders(orders);}

}
