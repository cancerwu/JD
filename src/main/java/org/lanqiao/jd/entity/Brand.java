package org.lanqiao.jd.entity;

import java.util.Arrays;
import java.util.Set;

public class Brand {
    private Integer brand_id;

    private String brand_name;

    private byte[] brand_img;

    private Set<Product> productSet;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name == null ? null : brand_name.trim();
    }

    public byte[] getBrand_img() {
        return brand_img;
    }

    public void setBrand_img(byte[] brand_img) {
        this.brand_img = brand_img;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", brand_img=" + Arrays.toString(brand_img) +
                ", productSet=" + productSet +
                '}';
    }
}