package src.store.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.store.bean.ShoppingCart;
import src.store.mapper.ShoppingCartMapper;
@Service
public interface ShoppingCartService {

    // 获取用户购物车信息
    ShoppingCart[] getshoppingcartbyid(@Param("user_id")int user_id);
    // 查询用户的购物车的某个商品
    ShoppingCart findShoppingCart(@Param("user_id")int user_id, @Param("product_id")int product_id);
    // 新插入购物车信息
    void addShoppingCart(@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("num")int num);
    // 更新购物车商品数量
    void updateShoppingCart(@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("num")int num);
    // 删除购物车信息
    void deleteShoppingCart(@Param("user_id")int user_id,@Param("product_id")int product_id);
}
