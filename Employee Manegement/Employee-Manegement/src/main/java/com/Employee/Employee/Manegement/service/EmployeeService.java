package com.Employee.Employee.Manegement.service;

import java.util.List;

import com.Employee.Employee.Manegement.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long employeeId);
	
	List<EmployeeDto> getAllEmployees();
	
	EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);
	
	void deleteEmployee(Long employeeId);
}
