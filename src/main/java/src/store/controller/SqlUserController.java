package src.store.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.User;
import src.store.mapper.UserMapper;

@RestController
public class SqlUserController {
    /*用户*/
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user/getuserbykey",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public User UserOptSearchByKey(@Param("username")String username, @Param("password")String password){
        return userMapper.getUserBykey(username,password);
    }
    @RequestMapping(value = "/user/getuserbyname",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public User UserOptSearchByName(@Param("username")String username){
         return userMapper.getUserByName(username);
    }
    @RequestMapping(value = "/user/insertuser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptInsert(@Param("username")String username, @Param("password")String password){
        User user=new User(username,password);
        userMapper.insertUser(user);
    }
    @RequestMapping(value = "/user/deleteusebyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptDeleteUser(@Param("user_id") int user_id){
        System.out.println(user_id);
        userMapper.deleteUserByid(user_id);
    }
    @RequestMapping(value = "/user/deleteusebyuser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptDeleteUser(@Param("username")String username,@Param("password")String password){
        User user=new User(username,password);
        userMapper.deleteUserByUser(user);
    }
    @RequestMapping(value = "/user/updatauser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void UserOptUpdataUser(@Param("username")String username,@Param("password")String password){
        User user=new User(username,password);
        userMapper.updataUser(user);
    }
}
