package com.mudit.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	
	@ManyToOne
	@JoinColumn(name = "deptId", referencedColumnName = "deptId")
	private Department deptId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return deptId;
	}

	public void setDepartment(Department deptId) {
		this.deptId= deptId;
	}
	
	
}
