package com.jack.mybatis.test;

import com.jack.mybatis.mapper.UserMapper;
import com.jack.mybatis.pojo.User;
import com.jack.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Mybatis
 * @BelongsPackage: com.jack.mybatis.test
 * @Author: jack
 * @CreateTime: 2022-12-26  14:18
 * @Description: TODO
 * @Version: jdk1.8
 */
public class MybatisTest {


    @Test
    public void testGetUserById() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.getUserById("admin", "123");
        System.out.println(admin);


    }

    @Test
    public void testGetUserByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123");
        User userByMap = mapper.getUserByMap(map);
        System.out.println(userByMap);


    }

    @Test
    public void testAddUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.addUser(new User(null, "jack", "1234", 12, "男", "213@qq.com"));
        System.out.println(i);


    }

    @Test
    public void testGetUserReturnMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> admin = mapper.getUserReturnMap("admin");
        System.out.println(admin);


    }

    @Test
    public void testGetCount() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userReturnMap2 = mapper.getUserReturnMap2();
        System.out.println(userReturnMap2);


    }

    @Test
    public void testInsertUserKey() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "lili", "1234", 12, "男", "213@qq.com");
        mapper.insertUserKey(user);
        System.out.println(user);


    }

}
