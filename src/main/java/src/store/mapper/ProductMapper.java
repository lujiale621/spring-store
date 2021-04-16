package src.store.mapper;


import src.store.bean.Product;

public interface ProductMapper {
    Product getProductByid(int product_id);
    void insertProduct(Product product);
    void deletProductById(int product_id);
}
