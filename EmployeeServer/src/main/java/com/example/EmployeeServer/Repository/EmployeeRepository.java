package com.example.EmployeeServer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeServer.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
