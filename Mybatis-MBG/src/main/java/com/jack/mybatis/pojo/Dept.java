package com.jack.mybatis.pojo;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.dept_no
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private Integer deptNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.dept_name
     *
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    private String deptName;


    public Dept(Integer deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public Dept() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.dept_no
     *
     * @return the value of t_dept.dept_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.dept_no
     *
     * @param deptNo the value for t_dept.dept_no
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.dept_name
     *
     * @return the value of t_dept.dept_name
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.dept_name
     *
     * @param deptName the value for t_dept.dept_name
     * @mbggenerated Tue Dec 27 18:50:19 CST 2022
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }

}