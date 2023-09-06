package com.employee.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.controller.EmployeeController;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.excep.SalaryNotException;

@Service
public class EmployeeService {
	public static Logger l=Logger.getLogger(EmployeeController.class);
	@Autowired
	EmployeeDao ed;

	public String setEmp(List<Employee> e) throws SalaryNotException {
		List<Employee> emp=e.stream().filter(x->x.getSalary()>=75000).toList();
	
		if(emp.isEmpty()) {
			throw new SalaryNotException("Invalid Salary");
		}
		else {
			return ed.setEmp(emp);
		}
		
	}
	public List<Employee> getEmp() {
		l.info(ed.getEmp());
		return ed.getEmp();
	}

}
