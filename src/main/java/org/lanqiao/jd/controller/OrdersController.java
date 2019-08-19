package org.lanqiao.jd.controller;


import org.lanqiao.jd.entity.AllOrdersInfo;
import org.lanqiao.jd.entity.Orders;
import org.lanqiao.jd.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    @CrossOrigin
    @RequestMapping("/getOrdersId")
    public  String getOrdersId(HttpServletRequest request){
        HttpSession idsession = request.getSession();
        String b=String.valueOf(ordersService.selectNearlyId().getOrder_id());

        idsession.setAttribute("order_id",b);
        String order_id = (String) idsession.getAttribute("order_id");
        return order_id;
    }
    @CrossOrigin
    @RequestMapping("/selectOrdersId")

    public int selectOrdersId() {
        return ordersService.selectNearlyId().getOrder_id();
    }
    @CrossOrigin
    @RequestMapping("/getAllU/{user_id}")
    public List<AllOrdersInfo> getAllU(@PathVariable Integer user_id){
        return ordersService.getAllU(user_id);
    }


}
