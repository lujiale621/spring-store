package src.store.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Orders;
import src.store.mapper.OrdersMapper;

@RestController
public class SqlOrdersController {
  @Autowired
  OrdersMapper ordersMapper;

    @RequestMapping(value = "/order/getorderbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Orders[] getOrders(@Param("user_id")int user_id){
      return ordersMapper.getOrdersById(user_id);
  }
    @RequestMapping(value = "/order/insertorder",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertOrders(@Param("order_id")long order_id,@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("product_num")int product_num,@Param("product_price")double product_price,@Param("order_time")long order_time){
        Orders order=new Orders();
        order.setOrder_id(order_id);
        order.setOrder_time(order_time);
        order.setProduct_id(product_id);
        order.setProduct_num(product_num);
        order.setProduct_price(product_price);
        order.setUser_id(user_id);
        ordersMapper.insertOrders(order);
    }
    @RequestMapping(value = "/order/deletorder",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deletOrders(@Param("user_id")int user_id,@Param("order_id")long order_id){
        ordersMapper.deletOrdersById(user_id,order_id);
    }
}
