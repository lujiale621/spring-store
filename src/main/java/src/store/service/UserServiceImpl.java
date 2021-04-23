package src.store.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.store.bean.User;
import src.store.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
    /*用户*/
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserId(Integer id) {
        return userMapper.getUserId(id);
    }

    @Override
    public User getUserBykey(String username, String password) {
         return userMapper.getUserBykey(username,password);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public void insertUser(String username, String password) {
        User user=new User(username,password);
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserByid(int user_id) {
        userMapper.deleteUserByid(user_id);
    }

    @Override
    public void deleteUserByUser(String username, String password) {
        User user=new User(username,password);
        userMapper.deleteUserByUser(user);
    }


    @Override
    public void updataUser(String username, String password) {
        User user=new User(username,password);
        userMapper.updataUser(user);
    }
}
