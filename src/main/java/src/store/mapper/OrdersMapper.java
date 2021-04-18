package src.store.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import src.store.bean.Orders;
@Mapper
public interface OrdersMapper {
    Orders[] getOrdersById(int user_id);
    void insertOrders(Orders orders);
    void deletOrdersById(@Param("user_id")int user_id, @Param("order_id")long order_id);

}
