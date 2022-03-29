package com.cat4.dto;

public class EmpDetail {

	private String empAdd;
	private String   empDept;
	private String empName;
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmpDetail(String empAdd, String empDept, String empName) {
		super();
		this.empAdd = empAdd;
		this.empDept = empDept;
		this.empName = empName;
	}
	public EmpDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpDetail [empAdd=" + empAdd + ", empDept=" + empDept + ", empName=" + empName + "]";
	}
	
	
	
}
