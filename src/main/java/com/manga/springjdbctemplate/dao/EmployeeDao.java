package com.manga.springjdbctemplate.dao;

import java.util.List;

import com.manga.springjdbctemplate.Employee;

public interface EmployeeDao {

	public abstract int insertEmployee(Employee emp);
	public abstract List<Employee> getEmployees();
	public abstract Employee  getEmployeeById(int empId);
}
