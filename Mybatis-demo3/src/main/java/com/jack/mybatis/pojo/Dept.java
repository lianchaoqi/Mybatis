package com.jack.mybatis.pojo;

import java.util.List;

/**
 * @BelongsProject: Mybatis
 * @BelongsPackage: com.jack.mybatis.pojo
 * @Author: jack
 * @CreateTime: 2022-12-27  11:26
 * @Description: TODO
 * @Version: jdk1.8
 */
public class Dept {
    private Integer deptNo;
    private String deptName;
    private List<Emp> empList;

    public Dept() {
    }

    public Dept(Integer deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", empList=" + empList +
                '}';
    }
}
