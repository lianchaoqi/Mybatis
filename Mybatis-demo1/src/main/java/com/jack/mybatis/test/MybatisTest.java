package com.jack.mybatis.test;

import com.jack.mybatis.mapper.UserMapper;
import com.jack.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
    public void testMybatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取session builder对象
        SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlBuilder.build(is);
        //获取session
        SqlSession sqlSession = build.openSession(true); //设置自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser();
        //提交事务
        //sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void testGetUserById() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取session builder对象
        SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlBuilder.build(is);
        //获取session
        SqlSession sqlSession = build.openSession(); //设置自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById();
        System.out.println(userById);
    }

    @Test
    public void testGetAllUser() throws IOException {
        //加载核心配置文
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user->{
            System.out.println(user);
        });
    }
}
