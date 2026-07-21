package com.coforge.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "employee",params = "Insert")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		
		String result="";
		boolean status = service.createEmployee(employee);
		
		if(status) {
			result = "SUCESS : Employee Object Saved";
		}else {
			result = "FAILED : Employee Object Not Saved";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.POST, params = "Update")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";
		boolean status = service.updateEmployee(employee);

		if (status) {
			result = "SUCCESS : Employee Object Updated";
		} else {
			result = "FAILED : Employee Not Found, Nothing Updated";
		}

		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.POST, params = "Delete")
	public ModelAndView deleteEmployee(@RequestParam("eid") int eid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		boolean status = service.deleteEmployee(eid);

		if (status) {
			result = "SUCCESS : Employee Object Deleted";
		} else {
			result = "FAILED : Employee Not Found, Nothing Deleted";
		}

		mv.addObject("result", result);

		return mv;
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.POST, params = "Find")
	public ModelAndView findEmployee(@RequestParam("eid") int eid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		Employee status = service.findEmployee(eid);

		if (status!=null) {
			result = "SUCCESS : " + status.toString();
		} else {
			result = "FAILED : Employee Not Found";
		}

		mv.addObject("result", result);

		return mv;
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.POST, params = "FindAll")
	public ModelAndView findAllEmployee() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		List<Employee> employees= service.findAllEmployee();

		mv.addObject("result", employees);

		return mv;
	}
	
	
}
