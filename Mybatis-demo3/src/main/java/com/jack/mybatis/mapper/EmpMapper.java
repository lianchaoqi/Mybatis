package com.jack.mybatis.mapper;

import com.jack.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();

    Emp getEmpAndDept(int id);
}
