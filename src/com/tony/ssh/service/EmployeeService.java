package com.tony.ssh.service;

import java.util.List;

import com.tony.ssh.dao.EmployeeDao;
import com.tony.ssh.entities.Employee;

public class EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAll() {
		
		 List<Employee> employees = employeeDao.getAll();
		 employees.clear();
		 return employees;
	}
	
}
