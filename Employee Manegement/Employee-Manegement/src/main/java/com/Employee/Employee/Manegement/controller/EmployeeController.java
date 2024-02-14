package com.Employee.Employee.Manegement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Employee.Manegement.dto.EmployeeDto;
import com.Employee.Employee.Manegement.service.EmployeeService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	//build Add Employee REST API
	//@RequestBody ---convert json to javaobject
	@PostMapping("/api/employees")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployee =employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	//build get All Employee rest API
	@GetMapping("/api/employees/{id}")
	public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable("id") Long employeeId){
		EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.ok(employeeDto);
	}
	
	//Build Get All Employees REST API
	@GetMapping("/api/employee/all")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> employees =employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
	}
	
	//build updateEmployee REST API
	@PutMapping("/api/employees/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
			                                           @RequestBody EmployeeDto updatedEmployee){
		EmployeeDto employeeDto = employeeService.updateEmployee(employeeId,updatedEmployee);
		return ResponseEntity.ok(employeeDto);
	}
	
	//build Delete Employee Rest API
	@DeleteMapping("/api/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.ok("Employee deleted successfully");
	}
}
