package com.example.EmployeeServer.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeServer.Entity.Employee;
import com.example.EmployeeServer.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	//postmapping
	@PostMapping("/api/employee/add")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
	
		Employee emp =service.addEmployee(employee);
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/api/employee/")
	public ResponseEntity<List<Employee>> viewEmployees() {
		List<Employee> viewEmployees = service.viewEmployees();
		return new ResponseEntity<>(viewEmployees,HttpStatus.OK);
	}
	@GetMapping("/api/employee/{code}")
	public ResponseEntity<Employee> viewEmployee(@PathVariable Long code) {
		Employee employee=service.viewEmployee(code);
		return new ResponseEntity<>(employee,HttpStatus.FOUND);
	}
	@DeleteMapping("/api/employee/delete/{code}")
	public ResponseEntity<Void> deleteEmployeeByCode(@PathVariable Long code) {
		service.deleteEmployeeByCode(code);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/api/employee/edit")
	public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee){
		Employee saveEmployee = service.saveEmployee(employee);
		return new ResponseEntity<>(saveEmployee,HttpStatus.OK);
	}
}
