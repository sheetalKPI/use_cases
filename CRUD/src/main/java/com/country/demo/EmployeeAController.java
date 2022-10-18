package com.country.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeAController {
	@Autowired
	private EmployeeRepo er;//up to date

	@Autowired
	@GetMapping("/A") 
	public ArrayList<String> getA(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    	  
    		if(emt.getEmployee_name().startsWith("a"))
    		{
    	       transformedvalues.add(emt.getEmployee_name());
    	
    	}
    	}
    	return transformedvalues;
    	}
    	
	}
