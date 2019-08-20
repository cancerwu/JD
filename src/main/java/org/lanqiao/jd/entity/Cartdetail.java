package org.lanqiao.jd.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cartdetail {
    private Integer cart_detail_id;

    private Integer cart_id;

    private Integer pro_id;

    private Integer pro_num;

    private BigDecimal pro_price;

    private Date add_time;

    public Integer getCart_detail_id() {
        return cart_detail_id;
    }

    public void setCart_detail_id(Integer cart_detail_id) {
        this.cart_detail_id = cart_detail_id;
    }

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getPro_num() {
        return pro_num;
    }

    public void setPro_num(Integer pro_num) {
        this.pro_num = pro_num;
    }

    public BigDecimal getPro_price() {
        return pro_price;
    }

    public void setPro_price(BigDecimal pro_price) {
        this.pro_price = pro_price;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }
}