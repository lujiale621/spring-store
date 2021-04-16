package src.store.mapper;

import src.store.bean.Orders;

public interface OrdersMapper {
    Orders getOrdersById(int user_id);
    void insertOrders(Orders orders);
    void deletOrdersById(int order_id);
}
