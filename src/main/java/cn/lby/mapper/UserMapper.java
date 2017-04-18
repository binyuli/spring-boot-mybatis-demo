package cn.lby.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.lby.entity.User;

public interface UserMapper {
    @Insert("insert into users(name,email) values(#{name},#{email})")
    int insertUser(User user);
 
    @Select("select id, name, email from users WHERE id=#{id}")
    User findUserById(Integer id);
 
    @Select("select id, name, email from users")
    List<User> findAllUsers();
    
}
