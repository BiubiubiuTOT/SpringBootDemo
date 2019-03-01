package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lu shun zhi
 * @version 2.0.0
 * @date 2019/2/27 17:15
 */
@Mapper
public interface UserMapper {
    List<User> selectUser();

    void addUser(User user);

    void updateUser(User user);

    int deleteUser(@Param("id") int id);
}
