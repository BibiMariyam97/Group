package com.employee.service;

import java.util.List;

import com.employee.model.Employee;



public interface EmployeeService {

public Employee create(Employee employee);
	
	public Employee update(Employee employee, int id);
	
	public void delete(int id);
	
	public Employee getById(int id);
	
	public List<Employee> getAll(String sortBy,String sortDir);
	public List<Employee> getAll();
	
	public List<Employee> getByFirstname(String firstname);
}