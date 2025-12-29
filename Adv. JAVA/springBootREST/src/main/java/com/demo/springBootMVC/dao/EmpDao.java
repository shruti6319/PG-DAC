package com.demo.springBootMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.springBootMVC.beans.Employee;

@Repository
public interface EmpDao extends JpaRepository<Employee, Integer> {


}
