package com.paginator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.paginator.models.Employees;
import com.paginator.repository.EmployeeRepository;

@Service
public class EmployeeSevice {
	@Autowired
	EmployeeRepository empResp;
	
	@SuppressWarnings({ "unchecked", "deprecation" })
//	public List<Employees> getEmployeeData(String empName)
	public List<Employees> getEmployeeData(int startPage,int pageSize)
	{
		System.out.println(empResp.findAll(new PageRequest(startPage,pageSize)).getContent());
//		return empResp.findEmployeesByEmpName(empName,new PageRequest(0,10));
//		return empResp.findAll(new PageRequest(0,10)).getContent();
		return empResp.findAll(new PageRequest(startPage,pageSize)).getContent();
	}
	
	public long getEmployeeDataCount()
	{
		return empResp.count();
	}
	
}
