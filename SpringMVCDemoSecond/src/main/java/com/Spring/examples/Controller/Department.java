package com.Spring.examples.Controller;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;  
import java.lang.annotation.RetentionPolicy;  

@Constraint(validatedBy = DepartmentConstraintValidator.class)  
@Target( { ElementType.METHOD, ElementType.FIELD } )  
@Retention(RetentionPolicy.RUNTIME)  
public @interface Department {

	  public String message() default "invalid department name";  
	         
	        public Class<?>[] groups() default {};  
	     
	        public Class<? extends Payload>[] payload() default {};

			String ListOfValid() default "IT|Admin|Facilities|Hr";  
		
}
