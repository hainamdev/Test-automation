package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.jparepository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<employee> result = employeeRepository.findById(id);
		if(result.isPresent())	
			return result.get();
		else
			throw new  RuntimeException("khong tim thay employee co id= " + id);
	}

}
