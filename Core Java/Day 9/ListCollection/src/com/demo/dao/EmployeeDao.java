      package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
	
	boolean save(Employee e);
	
	List<Employee> findAll();
	
	Employee findById(int eid);
	
	boolean removeById(int eid);
	
	List<Employee> findByName(String nm);

	List<Employee> findBySal(double sal);

	boolean removeBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	boolean modifyById(int eid, double sal);

}
