package com.Employee.Employee.Manegement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Employee.Manegement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
