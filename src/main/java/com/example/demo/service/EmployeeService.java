package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;

public interface EmployeeService {
	List<employee> getAllEmployee();
	employee getEmployee(int id);
}
