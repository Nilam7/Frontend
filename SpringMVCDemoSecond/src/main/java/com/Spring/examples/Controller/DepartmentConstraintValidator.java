package com.Spring.examples.Controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class DepartmentConstraintValidator implements ConstraintValidator<Department,String>{
	 private String ListOfvalid;

	 public boolean isValid(String department, ConstraintValidatorContext cvc) {
		  if(department==null)
			  return false;
		  if(department.matches(ListOfvalid))
			  return true;
		  else
			  return false;
	
		
		
		
	}

	public void initialize(Department department) {
		this.ListOfvalid = department.ListOfValid();
		
		
	}
	

}
