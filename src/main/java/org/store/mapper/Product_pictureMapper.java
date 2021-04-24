package src.store.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import src.store.bean.Product;
import src.store.bean.Product_picture;
@Mapper
public interface Product_pictureMapper {
    Product_picture[] getProduct_pictureByid(int product_id);
    void insertProduct_picture(Product_picture product_picture);
    void deletProduct_pictureById(@Param("product_id")int product_id, @Param("product_picture")String product_picture);

}
