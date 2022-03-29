package com.cat4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cat4.dto.EmpDetail;
import com.cat4.dto.Employee;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	JdbcTemplate jdbcTemplate;
      
	@Override
	public List<Employee> getAllEmpDetail(EmpDetail detail) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList();
		List<Employee> emplist = new ArrayList();
		System.out.println("getAllEmpDetail called on impl");
		String sql = "select name,dept,empCode from emp";
		List<Map<String, Object>> mapList= jdbcTemplate.queryForList(sql);
		System.out.println("size of mapList "+mapList.size());
		for(Map<String, Object> entryMap : mapList)
		{
		
			
			 Employee e=new Employee();
		  for(Entry<String, Object> entry : entryMap.entrySet())
		  {
			 
			 
			  if(entry.getKey().equals("id"))
			  {
				  Integer value=(Integer) entry.getValue(); 
			  e.setId(value);
			  }
			  else if(entry.getKey().equals("name"))
			  {
				  e.setName((String)entry.getValue());
			  }else if(entry.getKey().equals("dept"))
			  {
				  e.setDept((String)entry.getValue());
			  }else if(entry.getKey().equals("empCode"))
			  {
				  e.setEmpCode(Integer.parseInt((String)entry.getValue()));
			  }
			 
		  }
		  emplist.add(e);
		
		}
		
		
		/*
		 * for (String s : li) { Employee e = new Employee(); e.setName(s);
		 * emplist.add(e);
		 * 
		 * }
		 */
		return emplist;
	}

	@Override
	public Employee findByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
