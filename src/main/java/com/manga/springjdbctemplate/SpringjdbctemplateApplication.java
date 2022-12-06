package com.manga.springjdbctemplate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.manga.springjdbctemplate.service.EmployeeService;

@SpringBootApplication
public class SpringjdbctemplateApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringjdbctemplateApplication.class, args);
		EmployeeService empService = appContext.getBean(EmployeeService.class);
		// 1. Code to insert employee record
		int count = empService.insertEmployee(new Employee(103, "Aarohi", 6));
		System.out.println(count + "(s) inserted");

		// 2. Code to call All Employees

		List<Employee> empList = empService.getEmployees();
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		// empList.forEach(emp -> System.out.println(emp));

		// 3. code to get emp based on given id

		Employee e = empService.getEmployeeById(103);
		System.out.println(e);

	}

}
