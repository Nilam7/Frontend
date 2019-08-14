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
			
			if(categoryobj.getCategoryId()==0) {
				categoryDao.addCategory(categoryobj);
				map.addAttribute("msg","Category Added Sucesfully..");
			}
			else {
				categoryDao.update(categoryobj);
				map.addAttribute("msg","Category Updated Sucesfully..");
			}
			
			List<Category> categoryList=categoryDao.getAllCategories();
			map.addAttribute("categories",categoryList);
			
			return "ViewCategory";
			
		}
		
		@RequestMapping(value="/viewCategories",method=RequestMethod.GET)
		public String getAllCategories(ModelMap map) {
			
				List<Category> categoryList=categoryDao.getAllCategories();
				map.addAttribute("categories",categoryList);
				return "ViewCategory";
			
		}
		
		@RequestMapping(value="/deleteCategory/{Id}",method=RequestMethod.GET)
		public String deleteCategory(@PathVariable int Id,ModelMap map){
			categoryDao.deleteCategory(Id);
			List<Category> categoryList=categoryDao.getAllCategories();
			map.addAttribute("categories",categoryList);
			map.addAttribute("msg","Category Deleted Sucesfully..");
			return "ViewCategory";
		
		}
		@RequestMapping(value="/updateCategory/{Id}",method=RequestMethod.GET)
		public String updateCategoryForm(@PathVariable int Id,ModelMap map){
			Category cObj=categoryDao.getCategoryById(Id);
			map.addAttribute("categoryobj",cObj);
			return "Category";
	}
	}
