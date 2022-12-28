package com.jack.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_no
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private Integer empNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.age
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.sex
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.email
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.dept_no
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private Integer deptNo;

    public Emp() {
    }

    public Emp(Integer empNo, String empName, Integer age, String sex, String email, Integer deptNo) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.deptNo = deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_no
     *
     * @return the value of t_emp.emp_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_no
     *
     * @param empNo the value for t_emp.emp_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.age
     *
     * @return the value of t_emp.age
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.age
     *
     * @param age the value for t_emp.age
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.sex
     *
     * @return the value of t_emp.sex
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.sex
     *
     * @param sex the value for t_emp.sex
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.email
     *
     * @return the value of t_emp.email
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.email
     *
     * @param email the value for t_emp.email
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.dept_no
     *
     * @return the value of t_emp.dept_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.dept_no
     *
     * @param deptNo the value for t_emp.dept_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
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
                '}';
    }
}