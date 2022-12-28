package com.jack.mybatis.test;

import com.jack.mybatis.mapper.DeptMapper;
import com.jack.mybatis.mapper.EmpMapper;
import com.jack.mybatis.pojo.Dept;
import com.jack.mybatis.pojo.Emp;
import com.jack.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @BelongsProject: Mybatis
 * @BelongsPackage: com.jack.mybatis.test
 * @Author: jack
 * @CreateTime: 2022-12-27  11:47
 * @Description: TODO
 * @Version: jdk1.8
 */
public class TestResultMap {
    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(emp -> System.out.println(emp));
    }


    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDept = mapper.getEmpAndDept(1);
        System.out.println(empAndDept);

    }

    @Test
    public void testGetDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmp = mapper.getDeptAndEmp();
        System.out.println(deptAndEmp);


    }
}
