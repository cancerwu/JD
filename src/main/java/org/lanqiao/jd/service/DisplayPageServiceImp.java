package org.lanqiao.jd.service;


import org.lanqiao.jd.entity.Brand;
import org.lanqiao.jd.entity.Evaluate;
import org.lanqiao.jd.entity.Kind;
import org.lanqiao.jd.entity.Product;
import org.lanqiao.jd.mapper.BrandMapper;
import org.lanqiao.jd.mapper.EvaluateMapper;
import org.lanqiao.jd.mapper.KindMapper;
import org.lanqiao.jd.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayPageServiceImp implements DisplayPageService {


    @Autowired
    EvaluateMapper evaluateMapper;

    @Autowired
    KindMapper kindMapper;

    @Autowired
    BrandMapper brandMapper;

    @Autowired
    ProductMapper productMapper;


    /************************************************************************************************************/

    @Override
    public int deleteByPrimaryKeyBrand(Integer brand_id) {
        return brandMapper.deleteByPrimaryKeyBrand(brand_id);
    }

    @Override
    public int insertBrand(Brand record) {
        return brandMapper.insertBrand(record);
    }

    @Override
    public int insertSelectiveBrand(Brand record) {
        return brandMapper.insertSelectiveBrand(record);
    }

    @Override
    public Brand selectByPrimaryKeyBrand(Integer brand_id) {
        return brandMapper.selectByPrimaryKeyBrand(brand_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveBrand(Brand record) {
        return brandMapper.updateByPrimaryKeySelectiveBrand(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBsBrand(Brand record) {
        return brandMapper.updateByPrimaryKeyWithBLOBsBrand(record);
    }

    @Override
    public int updateByPrimaryKeyBrand(Brand record) {
        return brandMapper.updateByPrimaryKeyBrand(record);
    }

    @Override
    public List<Brand> selectAllBrand() {
        return brandMapper.selectAllBrand();
    }

    @Override
    public Brand select_Brand_Product(Integer brand_id) {
        return brandMapper.select_Brand_Product(brand_id);
    }

    /************************************************************************************************************/
    @Override
    public int deleteByPrimaryKeyKind(Integer kind_id) {
        return kindMapper.deleteByPrimaryKeyKind(kind_id);
    }

    @Override
    public int insertKind(Kind record) {
        return kindMapper.insertKind(record);
    }

    @Override
    public int insertSelectiveKind(Kind record) {
        return kindMapper.insertSelectiveKind(record);
    }

    @Override
    public Kind selectByPrimaryKeyKind(Integer kind_id) {
        return kindMapper.selectByPrimaryKeyKind(kind_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveKind(Kind record) {
        return kindMapper.updateByPrimaryKeySelectiveKind(record);
    }

    @Override
    public int updateByPrimaryKeyKind(Kind record) {
        return kindMapper.updateByPrimaryKeyKind(record);
    }


    @Override
    public List<Kind> selectAllKind() {
        return kindMapper.selectAllKind();
    }

    @Override
    public Kind select_Kind_Product(Integer kind_id) {
        return kindMapper.select_Kind_Product(kind_id);
    }

    /************************************************************************************************************/
//    @Override
//    public int deleteByPrimaryKeyProduct(Integer pro_id) {
//        return productMapper.deleteByPrimaryKeyProduct(pro_id);
//    }
//
//    @Override
//    public int insertProduct(Product record) {
//        return productMapper.insertProduct(record);
//    }
//
//    @Override
//    public int insertSelectiveProduct(Product record) {
//        return productMapper.insertSelectiveProduct(record);
//    }
//
//    @Override
//    public Product selectByPrimaryKeyProduct(Integer pro_id) {
//        return productMapper.selectByPrimaryKeyProduct(pro_id);
//    }
//
//    @Override
//    public int updateByPrimaryKeySelectiveProduct(Product record) {
//        return productMapper.updateByPrimaryKeySelectiveProduct(record);
//    }
//
//
//    @Override
//    public int updateByPrimaryKeyProduct(Product record) {
//        return productMapper.updateByPrimaryKeyProduct(record);
//    }
//
//
//    @Override
//    public List<Product> selectAllProduct() {
//        return productMapper.selectAllProduct();
//    }

    @Override
    public List<Product> selectAllProductKBE() {
        return productMapper.selectAllProductKBE();
    }

    /************************************************************************************************************/
    @Override
    public int deleteByPrimaryKeyEvaluate(Integer eva_id) {
        return evaluateMapper.deleteByPrimaryKeyEvaluate(eva_id);
    }

    @Override
    public int insertEvaluate(Evaluate record) {
        return evaluateMapper.insertEvaluate(record);
    }

    @Override
    public int insertSelectiveEvaluate(Evaluate record) {
        return evaluateMapper.insertSelectiveEvaluate(record);
    }

    @Override
    public Evaluate selectByPrimaryKeyEvaluate(Integer eva_id) {
        return evaluateMapper.selectByPrimaryKeyEvaluate(eva_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveEvaluate(Evaluate record) {
        return evaluateMapper.updateByPrimaryKeySelectiveEvaluate(record);
    }

    @Override
    public int updateByPrimaryKeyEvaluate(Evaluate record) {
        return evaluateMapper.updateByPrimaryKeyEvaluate(record);
    }

    @Override
    public List<Evaluate> selectAllEvaluate(){return evaluateMapper.selectAllEvaluate();}

    @Override
    public int countAllEvaluate() {
        return evaluateMapper.countAllEvaluate();
    }

    /************************************************************************************************************/
//    @Override
//    public int deleteByPrimaryKeyUsersafe(Integer uesr_id) {
//        return usersafeMapper.deleteByPrimaryKeyUsersafe(uesr_id);
//    }
//
//    @Override
//    public int insertUsersafe(Usersafe record) {
//        return usersafeMapper.insertUsersafe(record);
//    }
//
//    @Override
//    public int insertSelectiveUsersafe(Usersafe record) {
//        return usersafeMapper.insertSelectiveUsersafe(record);
//    }
//
//    @Override
//    public Usersafe selectByPrimaryKeyUsersafe(Integer uesr_id) {
//        return usersafeMapper.selectByPrimaryKeyUsersafe(uesr_id);
//    }
//
//    @Override
//    public int updateByPrimaryKeySelectiveUsersafe(Usersafe record) {
//        return usersafeMapper.updateByPrimaryKeySelectiveUsersafe(record);
//    }
//
//    @Override
//    public int updateByPrimaryKeyUsersafe(Usersafe record) {
//        return usersafeMapper.updateByPrimaryKeyUsersafe(record);
//    }
//
//
//    @Override
//    public List<Usersafe> selectAllUsersafe() {
//        return usersafeMapper.selectAllUsersafe();
//    }
    /************************************************************************************************************/
}
