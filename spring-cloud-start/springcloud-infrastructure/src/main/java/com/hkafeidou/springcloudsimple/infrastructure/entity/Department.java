package com.hkafeidou.springcloudsimple.infrastructure.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table HSM_Department
 */
public class Department  implements Serializable,IEntity{
	
    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
	public Department(Integer id, String deptName, String deptDesc, Date createTime, String dbSource, Long deptCode) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
		this.createTime = createTime;
		this.dbSource = dbSource;
		this.deptCode = deptCode;
	}



	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.deptName
     *
     * @mbg.generated
     */
    private String deptName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.deptDesc
     *
     * @mbg.generated
     */
    private String deptDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.dbSource
     *
     * @mbg.generated
     */
    private String dbSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSM_Department.deptCode
     *
     * @mbg.generated
     */
    private Long deptCode;
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.id
     *
     * @return the value of HSM_Department.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.id
     *
     * @param id the value for HSM_Department.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.deptName
     *
     * @return the value of HSM_Department.deptName
     *
     * @mbg.generated
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.deptName
     *
     * @param deptName the value for HSM_Department.deptName
     *
     * @mbg.generated
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.deptDesc
     *
     * @return the value of HSM_Department.deptDesc
     *
     * @mbg.generated
     */
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.deptDesc
     *
     * @param deptDesc the value for HSM_Department.deptDesc
     *
     * @mbg.generated
     */
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.createTime
     *
     * @return the value of HSM_Department.createTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.createTime
     *
     * @param createTime the value for HSM_Department.createTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.dbSource
     *
     * @return the value of HSM_Department.dbSource
     *
     * @mbg.generated
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.dbSource
     *
     * @param dbSource the value for HSM_Department.dbSource
     *
     * @mbg.generated
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSM_Department.deptCode
     *
     * @return the value of HSM_Department.deptCode
     *
     * @mbg.generated
     */
    public Long getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSM_Department.deptCode
     *
     * @param deptCode the value for HSM_Department.deptCode
     *
     * @mbg.generated
     */
    public void setDeptCode(Long deptCode) {
        this.deptCode = deptCode;
    }
}