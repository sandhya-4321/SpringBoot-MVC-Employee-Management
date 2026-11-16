package com.SpringBootMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootMvc.model.Employee;
import com.SpringBootMvc.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public void addEmployee(Employee emp) {
		er.save(emp);
	}
	
	public List<Employee> getAllEmp(){
		return er.findAll();
	}

	public void deleteByEid(int eid) {
		er.deleteById(eid);	
	}
	
	public Employee getEmployeeById(int eid) {
	    return er.findById(eid).orElse(null);
	}

	public void updateEmployee(Employee emp) {
	    er.save(emp);
	}
}
