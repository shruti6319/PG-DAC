package com.demo.springBootMVC.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.dto.EmployeeDto;

public interface EmpService {

	List<EmployeeDto> getall();

	EmployeeDto getById(int id);

	boolean addEmp(EmployeeDto p);

	boolean update(EmployeeDto p);

	boolean delete(int id);

}
