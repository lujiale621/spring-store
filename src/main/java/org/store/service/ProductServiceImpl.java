package src.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.store.bean.Product;
import src.store.bean.Product_picture;
import src.store.mapper.ProductMapper;
import src.store.mapper.Product_pictureMapper;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    Product_pictureMapper product_pictureMapper;
    @Autowired
    ProductMapper productMapper;

    @Override
    public Product[] getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public Product[] getProductBycategoryId(int category_id) {
        return productMapper.getProductByCateId(category_id);
    }

    @Override
    public Product getProductByid(int product_id) {
        return productMapper.getProductByid(product_id);
    }

    @Override
    public void insertProduct(int product_id, String product_name, int category_id, String product_title, String product_intro, String product_picture, double product_price, double product_selling_price, int product_num, int product_sales) {
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

    @Override
    public void deleteProductByid(int product_id) {
        productMapper.deletProductById(product_id);
    }

    @Override
    public Product_picture[] getProduct_pictureByid(int product_id) {
        return product_pictureMapper.getProduct_pictureByid(product_id);

    }


    @Override
    public void insertProduct_picture(int product_id, String product_picture, String intro) {
        Product_picture product_picture1=new Product_picture();
        product_picture1.setProduct_id(product_id);
        product_picture1.setProduct_picture(product_picture);
        product_picture1.setIntro(intro);
        product_pictureMapper.insertProduct_picture(product_picture1);
    }

    @Override
    public void deletProduct_pictureById(int product_id, String product_picture) {
        product_pictureMapper.deletProduct_pictureById(product_id,product_picture);
    }
}
