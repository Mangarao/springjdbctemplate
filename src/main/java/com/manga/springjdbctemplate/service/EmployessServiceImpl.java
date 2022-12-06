package com.manga.springjdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manga.springjdbctemplate.Employee;
import com.manga.springjdbctemplate.dao.EmployeeDao;

@Service
public class EmployessServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int insertEmployee(Employee emp) {
		return employeeDao.insertEmployee(emp);
		
	}

	@Override
	public List<Employee> getEmployees() {
		
		return employeeDao.getEmployees();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public int updateEmployee(Employee e) {
		return employeeDao.updateEmployee(e);
				
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(empId);
				
	}

}
