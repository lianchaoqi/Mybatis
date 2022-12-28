package com.jack.mybatis.mapper;

import com.jack.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int insertUser();

    User getUserById(String username, String password);

    User getUserByMap(Map<String, Object> map);

    List<User> getAllUser();

    int addUser(User user);

    Map<String, Object> getUserReturnMap(@Param("username") String name);

    Integer getCount();

    //多条数据放在map里面
    @MapKey("id")
    Map<String, Object> getUserReturnMap2();

    void insertUserKey(User user);
}
