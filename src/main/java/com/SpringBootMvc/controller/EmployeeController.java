package com.SpringBootMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootMvc.model.Employee;
import com.SpringBootMvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("/addEmp")
	public String addEmp() {
		return "addEmployee";
	}
	
	@PostMapping("/saveEmp")
	public ModelAndView saveEmp(@ModelAttribute Employee emp) {
		es.addEmployee(emp);
		System.out.println("Employee Register Successfully");
		return new ModelAndView("redirect:/employees/addEmp");
	}
	
	@GetMapping("/getEmp")
	public ModelAndView getAllEmployee() {
		List<Employee> emps=es.getAllEmp();
		ModelAndView mv=new ModelAndView();
		mv.addObject("employees",emps);
		mv.setViewName("employeelist");
		return mv;
	}
	
	@GetMapping("/{eid}/delete")
	public ModelAndView deleteEid(@PathVariable int eid) {
		es.deleteByEid(eid);
		return new ModelAndView("redirect:/employees/getEmp");
	}
	
	@GetMapping("/{eid}/update")
	public ModelAndView updateEmployee(@PathVariable int eid) {

	    Employee emp = es.getEmployeeById(eid);

	    ModelAndView mv = new ModelAndView("updateEmployee");
	    mv.addObject("employee", emp);

	    return mv;
	}

	@PostMapping("/update")
	public ModelAndView updateEmployeeData(@ModelAttribute Employee emp) {

	    es.updateEmployee(emp);

	    return new ModelAndView("redirect:/employees/getEmp");
	}

}
