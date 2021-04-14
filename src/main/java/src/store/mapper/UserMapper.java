package src.store.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import src.store.bean.User;

@Mapper
public interface UserMapper {
     User getUserId(Integer id);
     User getUserBykey(@Param("username")String username, @Param("password")String password);
     User getUserByName(@Param("username")String username);

     void insertUser(User user);
     void deleteUserByid(@Param("user_id")int user_id);
     void deleteUserByUser(User user);
     void updataUser(User user);
}
