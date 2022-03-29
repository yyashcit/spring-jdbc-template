package com.cat4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat4.service.EmployeeServiceImpl;
import java.util.List;

import com.cat4.dto.EmpDetail;
import com.cat4.dto.Employee;

@RestController
public class Cat4Controller {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/")
	public String checkApp() {
		return "Hello I am started";
	}

	@PostMapping("/all")
	public List<Employee> getAllDetais(@RequestBody EmpDetail detail) {
		System.out.println("getAllDetail called on controller");
		return employeeServiceImpl.getAllEmpDetail(detail);
	}

}
