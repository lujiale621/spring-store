package src.store.controller;

import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.User;
import src.store.mapper.UserMapper;
import src.store.service.UserServiceImpl;

@Api(description = "用户信息接口")
@RestController
public class SqlUserController {
    @Autowired
   UserServiceImpl userService;
    @RequestMapping(value = "/user/getuser",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public User[] UserOptSearch(){
        return userService.getUser();
    }

    @RequestMapping(value = "/user/getuserbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public User UserOptSearchById(@Param("user_id")int user_id){
        return userService.getUserId(user_id);
    }
    @RequestMapping(value = "/user/getuserbykey",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public User UserOptSearchByKey(@Param("username")String username, @Param("password")String password){
        return userService.getUserBykey(username,password);
    }
    @RequestMapping(value = "/user/getuserbyname",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public User UserOptSearchByName(@Param("username")String username){
         return userService.getUserByName(username);
    }
    @RequestMapping(value = "/user/insertuser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptInsert(@Param("username")String username, @Param("password")String password){
        userService.insertUser(username,password);
    }
    @RequestMapping(value = "/user/deleteusebyid",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public void UserOptDeleteUser(@Param("user_id") int user_id){
        userService.deleteUserByid(user_id);
    }
    @RequestMapping(value = "/user/deleteusebyuser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptDeleteUser(@Param("username")String username,@Param("password")String password){
        userService.deleteUserByUser(username,password);
    }
    @RequestMapping(value = "/user/updatauser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptUpdataUser(@Param("username")String username,@Param("password")String password){
        userService.updataUser(username,password);
    }
}
