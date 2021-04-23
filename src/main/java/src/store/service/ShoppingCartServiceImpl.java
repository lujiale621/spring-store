package src.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.store.bean.ShoppingCart;
import src.store.mapper.ShoppingCartMapper;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
    @Autowired
    ShoppingCartMapper shoppingCartMapper;
    @Override
    public ShoppingCart[] getshoppingcartbyid(int user_id) {
        return  shoppingCartMapper.getShoppingCartByid(user_id);
    }

    @Override
    public ShoppingCart findShoppingCart(int user_id, int product_id) {
        return shoppingCartMapper.getShoppingCartByKey(user_id, product_id);
    }

    @Override
    public void addShoppingCart(int user_id, int product_id, int num) {
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setNum(num);
        shoppingCart.setProduct_id(product_id);
        shoppingCart.setUser_id(user_id);
        shoppingCartMapper.insertShoppingCart(shoppingCart);
    }

    @Override
    public void updateShoppingCart(int user_id, int product_id, int num) {
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setNum(num);
        shoppingCart.setProduct_id(product_id);
        shoppingCart.setUser_id(user_id);
        shoppingCartMapper.updataShoppingCart(shoppingCart);
    }

    @Override
    public void deleteShoppingCart(int user_id, int product_id) {
        shoppingCartMapper.deletShoppingCartById(user_id,product_id);
    }
}
