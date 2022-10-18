package com.country.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	
		@Autowired
		private EmployeeRepo er;//up to date

		@GetMapping("/employeename") 
		public ArrayList<String> getemployeename(){
			ArrayList<String> transformedvalues=new ArrayList<String>();
	    	for(EmployeeEntity emt:er.findAll()) {
	    
	    		transformedvalues.add(emt.getEmployee_name());
	    	}
	    	return transformedvalues;
		}
}
