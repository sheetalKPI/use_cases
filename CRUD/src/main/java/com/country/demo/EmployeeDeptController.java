package com.country.demo;


	import java.util.ArrayList;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	public class EmployeeDeptController {
		
			@Autowired
			private EmployeeRepo er;//up to date

			@GetMapping("/Dept") 
			public ArrayList<String> getDept(){
				ArrayList<String> transformedvalues=new ArrayList<String>();
		    	for(EmployeeEntity emt:er.findAll()) {
		    
		    		transformedvalues.add(emt.getDepartment());
		    	}
		    	return transformedvalues;
			}
	}

