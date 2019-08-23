package com.Spring.examples.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.Spring.examples.Controller.Department;

public class Employee {

	@NotNull
	@Min(1)
	private Integer employeeId;
	@NotEmpty(message="Employee name is reuired")
	@Size(min=3,max=12)
	private String employeeName;
	@Email(message="email should be proper")
	@NotEmpty(message="email is required")
	private String email;
	@NotEmpty
	@Pattern(regexp="[6789][0-9]{9}")
	private String contactNumber;
	@Department
	private String departmentName;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
}
