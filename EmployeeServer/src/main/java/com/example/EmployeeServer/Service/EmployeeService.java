package com.example.EmployeeServer.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeServer.Entity.Employee;
import com.example.EmployeeServer.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public @Valid Employee addEmployee(@Valid Employee employee) {
			
		return repo.save(employee);

	}

	public List<Employee> viewEmployees() {
	
		return repo.findAll();
	}

	public Employee viewEmployee(Long code) {
	
		Optional<Employee> employee = repo.findById(code);
		if(!employee.isPresent()) {
			throw new RuntimeException("Employee with "+code+" not found");
		}
		
		return employee.get();
		
	}

	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	public void deleteEmployeeByCode(Long code) {
		
		repo.deleteById(code);
		
	}
	


}
