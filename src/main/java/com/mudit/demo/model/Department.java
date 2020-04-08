package com.mudit.demo.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int deptId;

	private String deptName;

	@OneToMany(mappedBy = "deptId")
	private List<Employee> employeeCollection;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployeeCollection() {
		return employeeCollection;
	}

	public void setEmployeeCollection(List<Employee> employeeCollection) {
		this.employeeCollection = employeeCollection;
	}
		
	
	
	
}
