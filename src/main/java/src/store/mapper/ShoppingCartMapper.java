package src.store.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import src.store.bean.ShoppingCart;
@Mapper
public interface ShoppingCartMapper {
    ShoppingCart[] getShoppingCartByid(int user_id);
    ShoppingCart getShoppingCartByKey(@Param("user_id") int user_id, @Param("product_id") int product_id);
    void insertShoppingCart(ShoppingCart shoppingCart);
    void updataShoppingCart(ShoppingCart shoppingCart);
    void deletShoppingCartById(@Param("user_id") int user_id, @Param("product_id") int product_id);
}
