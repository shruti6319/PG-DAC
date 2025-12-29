package com.demo.springBootMVC.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.dao.EmpDao;
import com.demo.springBootMVC.dto.EmployeeDto;
import com.demo.springBootMVC.mapper.EmployeeMapper;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao edao;

	@Override
	public List<EmployeeDto> getall() {
		List<Employee> elist=edao.findAll();
		List<EmployeeDto> elist1=elist.stream().map(emp->EmployeeMapper.mapToEmp(emp)).collect(Collectors.toList());
		return elist1;
	}

	@Override
	public EmployeeDto getById(int id) {
	    Employee e = edao.getById(id);
	    EmployeeDto e1=EmployeeMapper.mapToEmp(e);
	    
	    return e1 ;
	}


	@Override
	public boolean addEmp(EmployeeDto p) {
		Employee e=EmployeeMapper.mapToEmp(p);
		Employee s=edao.save(e);
		return true;
	}

	@Override
	public boolean update(EmployeeDto p) {
		Employee e=EmployeeMapper.mapToEmp(p);
		Optional<Employee> s=edao.findById(e.getId());
		if(s.isPresent())
		{
			Employee e2=s.get();
			e2.setEname(p.getEname());
			e2.setSal(p.getSal());
			edao.save(e2);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		edao.deleteById(id);
		return true;
	}


	
		
		
		
	
	}
	
	


