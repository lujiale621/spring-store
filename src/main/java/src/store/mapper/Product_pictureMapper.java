package src.store.mapper;

import src.store.bean.Product;
import src.store.bean.Product_picture;

public interface Product_pictureMapper {
    Product_picture getProduct_pictureByid(int product_id);
    void insertProduct_picture(Product_picture product_picture);
    void deletProduct_pictureById(int product_id);

}
