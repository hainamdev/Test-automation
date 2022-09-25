package com.example.demo.restcontroller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employee;
import com.example.demo.service.EmployeeService;

@RestController
public class FullRestController {
	
	@Autowired
	private EmployeeService employeeService; 

	@GetMapping("/")
	public String sayHello() {
		return "Hello word " + LocalDateTime.now(); 
	}
	
	@GetMapping("/list")
	public List<employee> findAllEmployee(){
		List<employee> employees = employeeService.getAllEmployee();
		return  employees;
	}
	
	@GetMapping("/{id}")
	public employee findEmployee(@PathVariable int id) {
		employee e = null;
		try {
			e = employeeService.getEmployee(id);
		} catch (Exception ex) {
		}
		return e;
	}
	
}
