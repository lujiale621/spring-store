package src.store.controller;

import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Product;
import src.store.bean.Product_picture;
import src.store.mapper.ProductMapper;
import src.store.mapper.Product_pictureMapper;
import src.store.service.ProductService;

@Api(description = "参品页面接口")
@RestController
public class SqlProductController {
   @Autowired
   ProductService productService;
    @RequestMapping(value = "/product/getproducts",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Product[] getAllProduct(){
       return productService.getAllProduct();
   }
    @RequestMapping(value = "/product/getproductsbycateid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product[] getProductBycategoryId(@Param("category_id")int category_id){
       return productService.getProductBycategoryId(category_id);
   }
    @RequestMapping(value = "/product/getproductsbyproductid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product getProductByid(@Param("product_id")int product_id){
       return productService.getProductByid(product_id);
   }
    @RequestMapping(value = "/product/insertproduct",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public void insertProduct(@Param("product_id")int product_id,@Param("product_name")String product_name,@Param("category_id")int category_id,@Param("product_title")String product_title,@Param("product_intro")String product_intro,@Param("product_picture")String product_picture,@Param("product_price")double product_price,@Param("product_selling_price")double product_selling_price,@Param("product_num")int product_num,@Param("product_sales")int product_sales){
        productService.insertProduct(product_id, product_name, category_id, product_title, product_intro, product_picture, product_price, product_selling_price, product_num, product_sales);
    }
    @RequestMapping(value = "/product/deleteproductbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteProductByid(@Param("product_id")int product_id){
        productService.deleteProductByid(product_id);
    }

    @RequestMapping(value = "/productpic/getproducts",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product_picture[] getproductpic(@Param("product_id")int product_id){
        return productService.getProduct_pictureByid(product_id);
    }
    @RequestMapping(value = "/productpic/insertproduct",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertproductpic(@Param("product_id")int product_id,@Param("product_picture")String product_picture,@Param("intro") String intro){
        productService.insertProduct_picture(product_id, product_picture, intro);
    }
    @RequestMapping(value = "/productpic/deleteproduct",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteproductpic(@Param("product_id")int product_id,@Param("product_picture")String product_picture){
        productService.deletProduct_pictureById(product_id,product_picture);
    }
}
