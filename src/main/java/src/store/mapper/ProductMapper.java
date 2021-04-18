package src.store.mapper;


import org.apache.ibatis.annotations.Mapper;
import src.store.bean.Product;
@Mapper
public interface ProductMapper {
    Product getProductByid(int product_id);
    Product[] getAllProduct();
    Product[] getProductByCateId(int category_id);
    void insertProduct(Product product);
    void deletProductById(int product_id);
}
