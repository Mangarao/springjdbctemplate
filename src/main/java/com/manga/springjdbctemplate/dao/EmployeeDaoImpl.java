package com.manga.springjdbctemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.manga.springjdbctemplate.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int insertEmployee(Employee emp) {
		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(query, new Object[] { emp.getId(), emp.getName(), emp.getAge() });

	}

	@Override
	public List<Employee> getEmployees() {

		return jdbcTemplate.query("select * from employee", 
				BeanPropertyRowMapper.newInstance(Employee.class));
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return jdbcTemplate.queryForObject("select * from employee  where id=?",
				BeanPropertyRowMapper.newInstance(Employee.class),empId );
	}

}
