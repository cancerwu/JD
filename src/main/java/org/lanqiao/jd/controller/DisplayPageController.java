package org.lanqiao.jd.controller;


import org.lanqiao.jd.entity.Brand;
import org.lanqiao.jd.entity.Evaluate;
import org.lanqiao.jd.entity.Kind;
import org.lanqiao.jd.entity.Product;
import org.lanqiao.jd.mapper.BrandMapper;
import org.lanqiao.jd.mapper.EvaluateMapper;
import org.lanqiao.jd.mapper.KindMapper;
import org.lanqiao.jd.mapper.ProductMapper;
import org.lanqiao.jd.service.DisplayPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DisplayPageController {

    @Autowired
    DisplayPageService displayPageService;



    /*
     * @RequestMapping("/getkind/{kind_id}")括号“{}”中的参数要与函数的参数同名
     * @PathVariable不可少，少了在浏览器里传参数后台无法识别
     * */
    @CrossOrigin
    @RequestMapping("/getkind/{kind_id}")
    public Kind getKind(@PathVariable Integer kind_id){return displayPageService.selectByPrimaryKeyKind(kind_id);}
    /***********************************************************************************/

    @CrossOrigin
    @RequestMapping("/getallkind")
    public List<Kind> getAllKind(){return displayPageService.selectAllKind();}

    @CrossOrigin
    @RequestMapping("/getallbrand")
    public List<Brand> getAllBrand(){return displayPageService.selectAllBrand();}


    @CrossOrigin
    @RequestMapping("/getallevaluate")
    public List<Evaluate> getAllEvaluate(){return displayPageService.selectAllEvaluate();}


    @CrossOrigin
    @RequestMapping("/selectkeykind")
    public Kind getIdKind(Integer kind_id){
        return displayPageService.select_Kind_Product(kind_id);
    }

    @CrossOrigin
    @RequestMapping("/selectkeybrand")
    public Brand getIdBrand(Integer brand_id){return displayPageService.select_Brand_Product(brand_id);}

    @CrossOrigin
    @RequestMapping("/selectgetproductkbe")
    public List<Product> getProductKBE(){return displayPageService.selectAllProductKBE();}
    /***********************************************************************************/
}
