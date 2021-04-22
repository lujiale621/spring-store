package src.store.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.ShoppingCart;
import src.store.mapper.ShoppingCartMapper;

@Api(description = "购物车接口")
@RestController
public class ShoppingCartController {
@Autowired
    ShoppingCartMapper shoppingCartMapper;
    @ApiOperation(value="获取购物所有商品", notes="根据用户id修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "user_id", value = "用户ID", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "/shop/getshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public ShoppingCart[] getShoppingcartById(@Param("user_id")int user_id){
        return  shoppingCartMapper.getShoppingCartByid(user_id);
    }
    @ApiOperation(value="添加商品到购物车", notes="把商品信息插入到购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "user_id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "product_id", value = "产品ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "num", value = "数量", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "/shop/insertshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void insertshoppingcart(@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("num")int num){
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setNum(num);
        shoppingCart.setProduct_id(product_id);
        shoppingCart.setUser_id(user_id);
        shoppingCartMapper.insertShoppingCart(shoppingCart);
    }
    @ApiOperation(value="删除商品", notes="根据用户id，产品id删除商品")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "user_id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "product_id", value = "产品ID", required = true, dataType = "Integer"),
    })
    @RequestMapping(value = "/shop/deleteshop",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void deleteShoppingCartById(@Param("user_id")int user_id,@Param("product_id")int product_id){
        shoppingCartMapper.deletShoppingCartById(user_id,product_id);
    }


}
