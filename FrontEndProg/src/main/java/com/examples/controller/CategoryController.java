package com.examples.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.model.Category;
	
	@Controller
	public class CategoryController {
		@Autowired
		CategoryDao categoryDao;
		@RequestMapping(value="/getcategoryform",method=RequestMethod.GET)
		public String fetchcategoryform(ModelMap map) {
			Category category=new Category();
			map.addAttribute("categoryobj",category);
			return "Category";	
		}
		
		@RequestMapping(value="/addcategory",method=RequestMethod.POST)
		public String addCategory(@ModelAttribute Category categoryobj,ModelMap map) {
			
			boolean res=categoryDao.addCategory(categoryobj);
			System.out.println(res);
			
			if(res)
			{
				List<Category> categoryList=categoryDao.getAllCategories();
				map.addAttribute("categories",categoryList);
				return "ViewCategory";
			}
			return "Error";
		}
		@RequestMapping(value="/deleteCategory/{Id}",method=RequestMethod.GET)
		public String deleteCategory(@PathVariable int Id,ModelMap map){
			categoryDao.deleteCategory(Id);
			List<Category> categoryList=categoryDao.getAllCategories();
			map.addAttribute("categories",categoryList);
			return "ViewCategories";
		
		}
	}
