package src.store.mapper;


import src.store.bean.ShoppingCart;

public interface ShoppingCartMapper {
    ShoppingCart getShoppingCartByid(int user_id);
    void insertShoppingCart(ShoppingCart shoppingCart);
    void deletShoppingCartById(int user_id);
}
