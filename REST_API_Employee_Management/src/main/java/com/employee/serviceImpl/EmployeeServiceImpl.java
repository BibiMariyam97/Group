package com.employee.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee create(Employee employee) {
		
		return  employeeRepository.save(employee);
	}

	@Override
	public Employee update(Employee employee, int id) {
		Optional<Employee> emp = this.employeeRepository.findById(employee.getId());
		
		Employee existing = emp.get();
		existing.setId(employee.getId());
		existing.setFirstname(employee.getFirstname());
		existing.setLastname(employee.getLastname());
		existing.setEmail(employee.getEmail());
		return employeeRepository.save(existing);
	}

	@Override
	public void delete(int id) {
		
		this.employeeRepository.deleteById(id);
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> getAll(String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByFirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
