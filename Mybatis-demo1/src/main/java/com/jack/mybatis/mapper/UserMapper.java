package com.jack.mybatis.mapper;

import com.jack.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    User getUserById();

    List<User> getAllUser();
}
