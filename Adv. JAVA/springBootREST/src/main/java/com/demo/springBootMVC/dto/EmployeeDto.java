package com.demo.springBootMVC.dto;

import java.sql.Date;

public class EmployeeDto {
	private int id;
	private String ename;
	private double sal;
	private String hireDate;
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(int id, String ename, double sal, String hireDate) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
		this.hireDate = hireDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", ename=" + ename + ", sal=" + sal + ", hireDate=" + hireDate + "]";
	}
	
	
	

}
