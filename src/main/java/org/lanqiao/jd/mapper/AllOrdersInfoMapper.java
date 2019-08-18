package org.lanqiao.jd.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.AllOrdersInfo;
import org.lanqiao.jd.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AllOrdersInfoMapper {
    public List<AllOrdersInfo> getAll(Integer user_id);
    public int updataOrders(Orders orders);
}
