package org.lanqiao.jd.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Brand;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface BrandMapper {
    int deleteByPrimaryKeyBrand(Integer brand_id);

    int insertBrand(Brand record);

    int insertSelectiveBrand(Brand record);

    Brand selectByPrimaryKeyBrand(Integer brand_id);

    int updateByPrimaryKeySelectiveBrand(Brand record);

    int updateByPrimaryKeyWithBLOBsBrand(Brand record);

    int updateByPrimaryKeyBrand(Brand record);

    List<Brand> selectAllBrand();

    Brand select_Brand_Product(Integer brand_id);
}