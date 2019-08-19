package org.lanqiao.jd.service;


import org.lanqiao.jd.entity.AllOrdersInfo;
import org.lanqiao.jd.entity.Orders;
import org.lanqiao.jd.mapper.AllOrdersInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

//    @Autowired
//    OrdersMapper ordersMapper;
//
//    public int updataOrders(Orders orders){return allOrdersInfoMapper.updataOrders(orders);}

    @Autowired
    AllOrdersInfoMapper allOrdersInfoMapper;
    public List<AllOrdersInfo> selectAll(Integer order_id){return allOrdersInfoMapper.getAll(order_id);}
    public int updataOrders(Orders orders){return allOrdersInfoMapper.updataOrders(orders);}
    public Orders selectNearlyId(){return allOrdersInfoMapper.selectNearlyId();}

}
