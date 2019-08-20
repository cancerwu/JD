package org.lanqiao.jd.service;


import org.lanqiao.jd.entity.Brand;
import org.lanqiao.jd.entity.Evaluate;
import org.lanqiao.jd.entity.Kind;
import org.lanqiao.jd.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DisplayPageService {
    /*************************************************************/
    int deleteByPrimaryKeyBrand(Integer brand_id);

    int insertBrand(Brand record);

    int insertSelectiveBrand(Brand record);

    Brand selectByPrimaryKeyBrand(Integer brand_id);

    int updateByPrimaryKeySelectiveBrand(Brand record);

    int updateByPrimaryKeyWithBLOBsBrand(Brand record);

    int updateByPrimaryKeyBrand(Brand record);

    List<Brand> selectAllBrand();

    Brand select_Brand_Product(Integer brand_id);
    /*************************************************************/
    int deleteByPrimaryKeyKind(Integer kind_id);

    int insertKind(Kind record);

    int insertSelectiveKind(Kind record);

    Kind selectByPrimaryKeyKind(Integer kind_id);

    int updateByPrimaryKeySelectiveKind(Kind record);

    int updateByPrimaryKeyKind(Kind record);

    List<Kind> selectAllKind();

    Kind select_Kind_Product(Integer kind_id);
    /*************************************************************/
//    int deleteByPrimaryKeyProduct(Integer pro_id);
//
//    int insertProduct(Product record);
//
//    int insertSelectiveProduct(Product record);
//
//    Product selectByPrimaryKeyProduct(Integer pro_id);
//
//    int updateByPrimaryKeySelectiveProduct(Product record);
//
//    int updateByPrimaryKeyProduct(Product record);
//
//    List<Product> selectAllProduct();

    List<Product> selectAllProductKBE();
    /*************************************************************/
    int deleteByPrimaryKeyEvaluate(Integer eva_id);

    int insertEvaluate(Evaluate record);

    int insertSelectiveEvaluate(Evaluate record);

    Evaluate selectByPrimaryKeyEvaluate(Integer eva_id);

    int updateByPrimaryKeySelectiveEvaluate(Evaluate record);

    int updateByPrimaryKeyEvaluate(Evaluate record);

    List<Evaluate> selectAllEvaluate();

    int countAllEvaluate();
    /*************************************************************/
//    int deleteByPrimaryKeyUsersafe(Integer user_id);
//
//    int insertUsersafe(Usersafe record);
//
//    int insertSelectiveUsersafe(Usersafe record);
//
//    Usersafe selectByPrimaryKeyUsersafe(Integer user_id);
//
//    int updateByPrimaryKeySelectiveUsersafe(Usersafe record);
//
//    int updateByPrimaryKeyUsersafe(Usersafe record);
//
//    List<Usersafe> selectAllUsersafe();
    /*************************************************************/
}
