package src.store.controller;

import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Product;
import src.store.mapper.ProductMapper;
@Api(description = "参品页面接口")
@RestController
public class SqlProductController {
   @Autowired
   ProductMapper productMapper;


    @RequestMapping(value = "/product/getproducts",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product[] getAllProduct(){
       return productMapper.getAllProduct();
   }
    @RequestMapping(value = "/product/getproductsbycateid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product[] getProductBycategoryId(@Param("category_id")int category_id){
       return productMapper.getProductByCateId(category_id);
   }
    @RequestMapping(value = "/product/getproductsbyproductid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Product getProductByid(@Param("product_id")int product_id){
       return productMapper.getProductByid(product_id);
   }
    @RequestMapping(value = "/product/insertproduct",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertProduct(@Param("product_id")int product_id,@Param("product_name")String product_name,@Param("category_id")int category_id,@Param("product_title")String product_title,@Param("product_intro")String product_intro,@Param("product_picture")String product_picture,@Param("product_price")double product_price,@Param("product_selling_price")double product_selling_price,@Param("product_num")int product_num,@Param("product_sales")int product_sales){
        Product product=new Product();
        product.setCategory_id(category_id);
        product.setProduct_id(product_id);
        product.setProduct_intro(product_intro);
        product.setProduct_name(product_name);
        product.setProduct_num(product_num);
        product.setProduct_picture(product_picture);
        product.setProduct_price(product_price);
        product.setProduct_sales(product_sales);
        product.setProduct_title(product_title);
        product.setProduct_selling_price(product_selling_price);
        productMapper.insertProduct(product);
    }
    @RequestMapping(value = "/product/deleteproductbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteProductByid(@Param("product_id")int product_id){
         productMapper.deletProductById(product_id);
    }

}
