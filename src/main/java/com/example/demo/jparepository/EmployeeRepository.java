package com.example.demo.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employee;

public interface EmployeeRepository extends JpaRepository<employee, Integer>  {

}
