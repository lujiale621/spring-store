package src.store.service;

import org.apache.ibatis.annotations.Param;
import src.store.bean.User;

public interface UserService {
    User getUserId(Integer id);
    User getUserBykey(@Param("username")String username, @Param("password")String password);
    User getUserByName(@Param("username")String username);

    void insertUser(@Param("username")String username, @Param("password")String password);
    void deleteUserByid(@Param("user_id")int user_id);
    void deleteUserByUser(@Param("username")String username,@Param("password")String password);
    void updataUser(@Param("username")String username,@Param("password")String password);
}
