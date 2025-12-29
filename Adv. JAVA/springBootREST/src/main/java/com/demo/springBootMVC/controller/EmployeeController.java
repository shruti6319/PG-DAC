package com.demo.springBootMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.dto.EmployeeDto;
import com.demo.springBootMVC.service.EmpService;

@RestController
public class EmployeeController {
	@Autowired
	EmpService eserv;
	
	
	@GetMapping("/Employee")
	public ResponseEntity<List<EmployeeDto>> getAll()
	{
		List<EmployeeDto> elist= eserv.getall();
		return ResponseEntity.ok(elist);
	}
	@GetMapping("/emp/{id}")
	public ResponseEntity<EmployeeDto> GetbyId(@PathVariable int id)

	{
		EmployeeDto e=eserv.getById(id);
		if(e!=null)
		{
			return  ResponseEntity.ok(e);
		}
		else {
		return (ResponseEntity<EmployeeDto>) ResponseEntity.notFound();}
		
	}
	
	@PostMapping("/emp")
	public ResponseEntity<String> addemp(@RequestBody EmployeeDto p)
	{
		boolean status=eserv.addEmp(p);
		return ResponseEntity.ok("succesfully");
	}
	
	@PutMapping("/emp")
	public ResponseEntity<String> updateemp(@RequestBody EmployeeDto p)
	{
		boolean status=eserv.update(p);
		return ResponseEntity.ok("succesfully");
	}
	
	@DeleteMapping("emp/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		boolean status=eserv.delete(id);
		return ResponseEntity.ok("succesfully");
	}
	

}
