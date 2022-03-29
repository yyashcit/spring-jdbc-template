package com.cat4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cat4.dto.EmpDetail;
import com.cat4.dto.Employee;

public interface EmployeeService {


	public List<Employee> getAllEmpDetail(EmpDetail detail	);

	public Employee findByName();

}
