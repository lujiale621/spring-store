package src.store.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.store.bean.Product;
import src.store.bean.Product_picture;

public interface ProductService {
    Product[] getAllProduct();

    Product[] getProductBycategoryId(@Param("category_id") int category_id);

    Product getProductByid(@Param("product_id") int product_id);

    void insertProduct(@Param("product_id") int product_id, @Param("product_name") String product_name, @Param("category_id") int category_id, @Param("product_title") String product_title, @Param("product_intro") String product_intro, @Param("product_picture") String product_picture, @Param("product_price") double product_price, @Param("product_selling_price") double product_selling_price, @Param("product_num") int product_num, @Param("product_sales") int product_sales);

    void deleteProductByid(@Param("product_id") int product_id);

    Product_picture[] getProduct_pictureByid(int product_id);

    void insertProduct_picture(@Param("product_id")int product_id,@Param("product_picture")String product_picture,@Param("intro") String intro);

    void deletProduct_pictureById(@Param("product_id") int product_id, @Param("product_picture") String product_picture);

}
