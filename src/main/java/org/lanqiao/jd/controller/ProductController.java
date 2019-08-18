package org.lanqiao.jd.controller;

import org.lanqiao.jd.entity.Product;
import org.lanqiao.jd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 2019/8/9.
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/getPro")
    public Product selectByPrimaryKey(Integer pro_id) {
        return productService.selectByPrimaryKey(pro_id);
    }
    @RequestMapping("/getP")
    public int getP(){
        return 1;
    }
}
