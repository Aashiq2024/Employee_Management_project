package com.guvi.employee_management.service;

import com.guvi.employee_management.model.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	Iterable<Employee> findEmployees();
	Employee getEmployeeId(Long id);
	void deleteEmployee(Long id);
}
