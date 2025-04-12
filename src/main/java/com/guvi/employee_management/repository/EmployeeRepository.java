package com.guvi.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guvi.employee_management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
