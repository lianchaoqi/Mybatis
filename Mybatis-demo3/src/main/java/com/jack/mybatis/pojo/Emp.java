package com.jack.mybatis.pojo;

/**
 * @BelongsProject: Mybatis
 * @BelongsPackage: com.jack.mybatis.pojo
 * @Author: jack
 * @CreateTime: 2022-12-27  11:24
 * @Description: TODO
 * @Version: jdk1.8
 */
public class Emp {
    private Integer empNo;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private Integer deptNo;
    private Dept dept;



    public Emp(Integer empNo, String empName, Integer age, String sex, String email, Integer deptNo) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.deptNo = deptNo;

    }

    public Emp() {
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", deptNo=" + deptNo +
                ", dept=" + dept +
                '}';
    }
}
