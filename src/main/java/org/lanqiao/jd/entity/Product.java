package org.lanqiao.jd.entity;

import java.util.Date;
import java.util.Set;

public class Product {
    private Integer pro_id;

    private String pro_name;

    private Double pro_weight;

    private String pro_color;

    private Date pro_issued_date;

    private Double pro_price;

    private Date pro_producted_date;

    private String pro_describe;

    private Integer pro_count;

    private Integer kind_id;

    private Integer brand_id;

    private String pro_img;

    /**************************************************************/
    private Brand brand;

    private Kind kind;

    private Set<Evaluate> evaluateSet;

    /**************************************************************/

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    public Double getPro_weight() {
        return pro_weight;
    }

    public void setPro_weight(Double pro_weight) {
        this.pro_weight = pro_weight;
    }

    public String getPro_color() {
        return pro_color;
    }

    public void setPro_color(String pro_color) {
        this.pro_color = pro_color == null ? null : pro_color.trim();
    }

    public Date getPro_issued_date() {
        return pro_issued_date;
    }

    public void setPro_issued_date(Date pro_issued_date) {
        this.pro_issued_date = pro_issued_date;
    }

    public Double getPro_price() {
        return pro_price;
    }

    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }

    public Date getPro_producted_date() {
        return pro_producted_date;
    }

    public void setPro_producted_date(Date pro_producted_date) {
        this.pro_producted_date = pro_producted_date;
    }

    public String getPro_describe() {
        return pro_describe;
    }

    public void setPro_describe(String pro_describe) {
        this.pro_describe = pro_describe == null ? null : pro_describe.trim();
    }

    public Integer getPro_count() {
        return pro_count;
    }

    public void setPro_count(Integer pro_count) {
        this.pro_count = pro_count;
    }

    public Integer getKind_id() {
        return kind_id;
    }

    public void setKind_id(Integer kind_id) {
        this.kind_id = kind_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getPro_img() {
        return pro_img;
    }

    public void setPro_img(String pro_img) {
        this.pro_img = pro_img == null ? null : pro_img.trim();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Set<Evaluate> getEvaluateSet() {
        return evaluateSet;
    }

    public void setEvaluateSet(Set<Evaluate> evaluateSet) {
        this.evaluateSet = evaluateSet;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_weight=" + pro_weight +
                ", pro_color='" + pro_color + '\'' +
                ", pro_issued_date=" + pro_issued_date +
                ", pro_price=" + pro_price +
                ", pro_producted_date=" + pro_producted_date +
                ", pro_describe='" + pro_describe + '\'' +
                ", pro_count=" + pro_count +
                ", kind_id=" + kind_id +
                ", brand_id=" + brand_id +
                ", pro_img='" + pro_img + '\'' +
                ", brand=" + brand +
                ", kind=" + kind +
                ", evaluateSet=" + evaluateSet +
                '}';
    }
}