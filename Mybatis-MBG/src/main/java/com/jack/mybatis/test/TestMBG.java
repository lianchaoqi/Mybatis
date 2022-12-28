package com.jack.mybatis.test;

import com.jack.mybatis.mapper.EmpMapper;
import com.jack.mybatis.pojo.Emp;
import com.jack.mybatis.pojo.EmpExample;
import com.jack.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @BelongsProject: Mybatis
 * @BelongsPackage: com.jack.mybatis.test
 * @Author: jack
 * @CreateTime: 2022-12-27  18:58
 * @Description: TODO
 * @Version: jdk1.8
 */
public class TestMBG {
    @Test
    public void test() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNoEqualTo(1);
        empExample.or().andAgeEqualTo(11);
        List<Emp> emps = mapper.selectByExample(empExample);
        emps.forEach(emp -> System.out.println(emp));

    }

    @Test
    public void pageLimitTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
    }
}
