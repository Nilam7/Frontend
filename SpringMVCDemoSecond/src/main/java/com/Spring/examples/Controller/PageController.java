package com.Spring.examples.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.examples.model.Employee;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","home"},method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("msg","Iris Software");
	
		return mv;
	}
	@RequestMapping(value= "getemployeeform",method=RequestMethod.GET)
	public ModelAndView getEmployeeForm(){
		ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("empobj",new Employee());
	
		return mv;
	}
	@RequestMapping(value= "getemployeeform",method=RequestMethod.POST)
	public ModelAndView addEmployee(@Valid @ModelAttribute(name="empobj") Employee empobj,BindingResult result){
		if(result.hasErrors()) {
		ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("empobj",empobj);
		return mv;
		}
		ModelAndView mv=new ModelAndView("ViewEmployee");
		return mv;
	}
}
	
