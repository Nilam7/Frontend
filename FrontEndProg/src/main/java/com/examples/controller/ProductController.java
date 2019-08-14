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
import com.vinayak.Dao.ProductDao;

import com.vinayak.model.Product;

@Controller
public class ProductController {
	@Autowired
		ProductDao productdao;
	
	
	@Autowired
	CategoryDao categoryDao;
	
	
		@RequestMapping(value="/getproductform",method=RequestMethod.GET)
		public String fetchproductform(ModelMap map) {
			Product p=new Product();
			map.addAttribute("productobj",p);
			map.addAttribute("categories",categoryDao.getAllCategories());
			return "Product";
			
		}
		@RequestMapping(value="/addproduct",method=RequestMethod.POST)
		public String addproduct(@ModelAttribute Product productobj,ModelMap map) {
			
			System.out.println(productobj.getCategoryId()+" "+productobj.getProductName());
			
			
			if(productobj.getCategoryId()==0) {
				productdao.addProduct(productobj);
				map.addAttribute("msg","Product Added Sucesfully..");
			}
			else {
			productdao.updateProduct(productobj);
			System.out.println("updating...");
			map.addAttribute("productobj",productobj);
			}
			List<Product> product=productdao.getAllProducts();
			map.addAttribute("productobj",product);
			
			return "ViewProduct";
		}
		@RequestMapping(value="/viewProduct",method=RequestMethod.GET)
		public String getAllCategories(ModelMap map) {
			
				List<Product> product=productdao.getAllProducts();
				map.addAttribute("categories",product);
				return "ViewProduct";
		}
		@RequestMapping(value="/deleteProduct/{Id}",method=RequestMethod.GET)
		public String deleteCategory(@PathVariable int Id,ModelMap map){
			productdao.deleteProduct(Id);
			List<Product> productList=productdao.getAllProducts();
			map.addAttribute("categories",productList);
			map.addAttribute("msg","Product Deleted Sucesfully..");
			return "ViewProduct";
		}
		@RequestMapping(value="/updateProduct/{Id}",method=RequestMethod.GET)
		public String updateCategoryForm(@PathVariable int Id,ModelMap map){
			System.out.println("i m in product update method");
			Product Obj=productdao.getProductById(Id);
			map.addAttribute("productobj",Obj);
			return "Display";
	}
	
}
