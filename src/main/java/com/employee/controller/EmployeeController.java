package com.employee.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.excep.SalaryNotException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {
	public static Logger l=Logger.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService es;
	
	@PostMapping(value="/setEmp")
	public String setEmp(@RequestBody List<Employee> emp) throws SalaryNotException {
		return es.setEmp(emp);
	}
	@GetMapping(value="/getEmp")
	public List<Employee> getEmp(){
		PropertyConfigurator.configure("logging.properties");
		l.info(es.getEmp());
		return es.getEmp();
	}

}
