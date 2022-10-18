package com.country.demo;

	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	public class SchoolController {
		@Autowired
		private SchoolRepo er;//up to date

		@Autowired
		@GetMapping("/school") 
		public List<SchoolEntity> getschool(){
			ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
	    	for(SchoolEntity emt:er.findAll()) {
	    		SchoolEntity temp=new SchoolEntity();
	    		temp.setId(emt.getId());
	    		if(emt.getSchool_name().contains("$")) {
	    			temp.setSchool_name(emt.getSchool_name().replaceAll("\\$", ""));
	    		}
	    		transformedvalues.add(temp);
	    	}
	    	return transformedvalues;
		}

	}


