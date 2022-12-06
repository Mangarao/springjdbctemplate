package com.manga.springjdbctemplate.service;

import java.util.List;

import com.manga.springjdbctemplate.Employee;

public interface EmployeeService {
	
	public abstract int insertEmployee(Employee emp);
	public abstract List<Employee> getEmployees();
	public abstract Employee  getEmployeeById(int empId);
	
	public abstract int updateEmployee(Employee e);
	public abstract int deleteEmployee(int empId);
	

}
