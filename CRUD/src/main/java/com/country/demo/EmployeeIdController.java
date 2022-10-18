package com.country.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeIdController {
	@Autowired
	private EmployeeRepo er;//up to date

	@Autowired
	@GetMapping("/Id") 
	public ArrayList<Integer> getID(){
		ArrayList<Integer> transformedvalues=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) 
    	{	
    		transformedvalues.add(emt.getId());
    	}
    	return transformedvalues;
}
}

