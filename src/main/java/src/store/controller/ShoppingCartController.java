package src.store.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.ShoppingCart;
import src.store.mapper.ShoppingCartMapper;

@RestController
public class ShoppingCartController {
@Autowired
    ShoppingCartMapper shoppingCartMapper;

    @RequestMapping(value = "/shop/getshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public ShoppingCart[] getShoppingcartById(@Param("user_id")int user_id){
        return  shoppingCartMapper.getShoppingCartByid(user_id);
    }
    @RequestMapping(value = "/shop/insertshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertshoppingcart(@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("num")int num){
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setNum(num);
        shoppingCart.setProduct_id(product_id);
        shoppingCart.setUser_id(user_id);
        shoppingCartMapper.insertShoppingCart(shoppingCart);
    }
    @RequestMapping(value = "/shop/deleteshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteShoppingCartById(@Param("user_id")int user_id,@Param("product_id")int product_id){
        shoppingCartMapper.deletShoppingCartById(user_id,product_id);
    }


}
