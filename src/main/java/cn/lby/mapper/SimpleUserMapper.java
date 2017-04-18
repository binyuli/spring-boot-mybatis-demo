package cn.lby.mapper;

import java.util.List;

import cn.lby.entity.User;

public interface SimpleUserMapper {
    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
}
