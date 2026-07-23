package com.coforge.dms.service;

import java.util.List;

import java.util.Optional;

import com.coforge.dms.model.Department;

public interface DepartmentService {

	public Optional<Department> findById(int dno);

	public List<Department> findAllDepartments();

}
