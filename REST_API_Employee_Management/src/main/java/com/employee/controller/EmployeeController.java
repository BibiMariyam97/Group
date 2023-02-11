package com.employee.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
    @PreAuthorize("hasAuthority('ADMIN')")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.create(emp);
	}

}
