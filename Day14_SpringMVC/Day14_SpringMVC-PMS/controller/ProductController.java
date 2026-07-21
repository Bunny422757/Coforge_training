package com.coforge.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "product",params = "Insert")
	public ModelAndView createProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result="";
		boolean status = service.createProduct(product);
		
		if(status) {
			result = "SUCESS : Product Registered";
		}else {
			result = "FAILED : Product already Exist";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "product",params = "Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result="";
		boolean status = service.updateProduct(product);
		
		if(status) {
			result = "SUCESS : Product Updated";
		}else {
			result = "FAILED : Product Not Getting Updated";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "product",params = "Delete")
	public ModelAndView deleteProduct(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result="";
		boolean status = service.deleteProduct(pid);
		
		if(status) {
			result = "SUCESS : Product Deleted";
		}else {
			result = "FAILED : Product Cannot be Deleted";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "product",params = "Find")
	public ModelAndView FindProduct(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result="";
		Product status = service.findProduct(pid);
		
		if(status != null) {
			result = status.toString();
		}else {
			result = "FAILED : Product Not Found";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "product",params = "FindAll")
	public ModelAndView FindAllProduct() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result="";
		List<Product> status = service.findAllProduct();
		
		if(status != null) {
			result = " " + status.toString();
		}else {
			result = "FAILED : Product Not Found";
		}
		
		mv.addObject("result", result);
		return mv;
	}

}
