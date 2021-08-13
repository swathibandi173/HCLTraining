package com.swathi.hcltraining.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swathi.hcltraining.Entity.Student;
import com.swathi.hcltraining.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> findByNameEquals(String name){
		return studentRepository.findByNameEquals(name);
	}
	
	public List<Student> findByNameIsNot(String name){
		return studentRepository.findByNameIsNot(name);
	}
	
	public List<Student> findByBranchIsNull(){
		return studentRepository.findByBranchIsNull();
	}
	
		
	public List<Student> findByEmailAndAge(String email,Integer age){
		return studentRepository.findByEmailAndAge(email,age);
		
	}
	
	public List<Student> findByAgeLessThan(Integer age){
		return studentRepository.findByAgeLessThan(age);
		
	}
	
	public List<Student> findByAgeBetween(Integer startAge, Integer endAge){
		return studentRepository.findByAgeBetween(startAge, endAge);
	}
	
	public List<Student> findByNameOrderByName(String name){
		return studentRepository.findByNameOrderByName(name);
	}
	
	public List<Student> findByBranchOrderByBranchDesc(String branch){
		return studentRepository.findByBranchOrderByBranchDesc(branch);
	}

	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	public List<Student> findAllStudents() {
		
		return studentRepository.findAll();
	}

}
