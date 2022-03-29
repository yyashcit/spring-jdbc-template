package com.cat4.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
	@JsonIgnore
	private int id;
	private String name;
	private int empCode;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empCode=" + empCode + ", dept=" + dept + "]";
	}

	public Employee(int id, String name, int empCode, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.empCode = empCode;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
