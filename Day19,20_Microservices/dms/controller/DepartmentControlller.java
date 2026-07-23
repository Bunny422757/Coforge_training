package com.coforge.dms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/dms")
public class DepartmentControlller {

	private DepartmentService service;
	public Environment environment;

	
	@Autowired
	public DepartmentControlller(DepartmentService service,Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}
	
	@GetMapping("/departments/{dno}")
	public ResponseEntity<?> findById(@PathVariable("dno") int dno){
		ResponseEntity<?> responseEntity = null;
		Optional<Department> department = service.findById(dno);
		if(department!=null) {
			responseEntity = new ResponseEntity<>(department.get(), HttpStatus.CREATED);
		}
		return responseEntity;
		
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> findAllDepartments(){
		ResponseEntity<?> responseEntity = null;
		List<Department> departments = service.findAllDepartments();
		responseEntity = new ResponseEntity<>(departments, HttpStatus.CREATED);
		return responseEntity;
		
	}
	
}
