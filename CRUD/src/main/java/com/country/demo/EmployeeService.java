package com.country.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service

public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	//@GetMapping("/sample2")
	public List<EmployeeEntity> list(){
		
		return (List<EmployeeEntity>) employeeRepo.findAll();
	}
	}
