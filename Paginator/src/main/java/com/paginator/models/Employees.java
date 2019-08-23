package com.paginator.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employees {
	@Id
	@GeneratedValue
	@Column(name="empId")
	int empId;
	
	@Column(name="empName")
	String empName;

	@Column(name="age")
	String empAge;
	
	@Column(name="address")
	String empAddress;
	
	@Column(name="email")
	String empEmail;
	
	@Column(name="education")
	String empEducation;
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpEducation() {
		return empEducation;
	}

	public void setEmpEducation(String empEducation) {
		this.empEducation = empEducation;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empAddress="
				+ empAddress + ", empEmail=" + empEmail + ", empEducation=" + empEducation + "]";
	}
}
