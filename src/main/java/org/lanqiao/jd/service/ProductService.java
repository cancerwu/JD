package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductService {
        public Product selectByPrimaryKey(Integer pro_id);
}
