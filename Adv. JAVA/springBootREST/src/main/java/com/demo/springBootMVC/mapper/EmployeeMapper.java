package com.demo.springBootMVC.mapper;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.dto.EmployeeDto;

public class EmployeeMapper {
	
	public static Employee mapToEmp(EmployeeDto e)
	{
		return new Employee(e.getId(),e.getEname(),e.getSal(),java.sql.Date.valueOf(e.getHireDate()));
	}
	
	public static EmployeeDto mapToEmp(Employee e)
	{
		if(e.getHireDate()!=null)
		{
			return new EmployeeDto(e.getId(),e.getEname(),e.getSal(),e.getHireDate().toString());
		}
		return new EmployeeDto(e.getId(),e.getEname(),e.getSal(),null);
	}

}
