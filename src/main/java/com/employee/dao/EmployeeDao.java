package com.employee.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.controller.EmployeeController;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	public static Logger l=Logger.getLogger(EmployeeController.class);
	@Autowired
	EmployeeRepository er;

	public String setEmp(List<Employee> emp) {
		er.saveAll(emp);
		
		return "Saved";
	}

	public List<Employee> getEmp() {
		l.info(er.findAll());
		return er.findAll();
	}

}
