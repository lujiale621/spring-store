package src.store.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Product_picture;
import src.store.mapper.Product_pictureMapper;

@RestController
public class SqlProductPictureController {
    @Autowired
    Product_pictureMapper product_pictureMapper;

    @RequestMapping(value = "/productpic/getproducts",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product_picture[] getproductpic(@Param("product_id")int product_id){
        return product_pictureMapper.getProduct_pictureByid(product_id);
    }
    @RequestMapping(value = "/productpic/insertproduct",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertproductpic(@Param("product_id")int product_id,@Param("product_picture")String product_picture,@Param("intro") String intro){
        Product_picture product_picture1=new Product_picture();
        product_picture1.setProduct_id(product_id);
        product_picture1.setProduct_picture(product_picture);
        product_picture1.setIntro(intro);
        product_pictureMapper.insertProduct_picture(product_picture1);
    }
    @RequestMapping(value = "/productpic/deleteproduct",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteproductpic(@Param("product_id")int product_id,@Param("product_picture")String product_picture){
        product_pictureMapper.deletProduct_pictureById(product_id,product_picture);
    }
}
