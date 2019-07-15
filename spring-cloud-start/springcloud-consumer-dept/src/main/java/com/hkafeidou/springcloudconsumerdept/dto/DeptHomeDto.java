package com.hkafeidou.springcloudconsumerdept.dto;

import java.io.Serializable;

import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;

public class DeptHomeDto implements Serializable {
	private Department department;
	private String uuid;
	private String remark;
	
	
	
	public DeptHomeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
