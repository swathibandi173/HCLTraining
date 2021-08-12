package com.example.EmployeeServer.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Employee_TB")
public class Employee {
	
	@Id
	@GeneratedValue
	//@Size(max=10)
	private Long code;
	//@Size(max=100)
	private String name;
	//@Size(max=1)
	private String gender;
	//@Size(max=100)
	private String designation;
	//@Size(max=100)
	private String emailid;
	//@Size(max=2)
	private String experience;
	//@Size(max=10)
	private Long phoneNumber;
	//@Size(max=100)
	private String location;
	//@Size(max=15)
	private String status;
	public Employee() {
		super();
	}
	public Employee(Long code, String name, String gender, String designation, String emailid, String experience,
			Long phoneNumber, String location, String status) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.emailid = emailid;
		this.experience = experience;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.status = status;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", gender=" + gender + ", designation=" + designation
				+ ", emailid=" + emailid + ", experience=" + experience + ", phoneNumber=" + phoneNumber + ", location="
				+ location + ", status=" + status + "]";
	}
	
	

}
