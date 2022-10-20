package com.Insurance.Health;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthInsuranceController {
	@Autowired
	private HealthInsuranceRepo HIr;
	@GetMapping("/details") 
    public ArrayList<HealthInsuranceEntity> getSample(){
    	    	
    	return (ArrayList<HealthInsuranceEntity>) HIr.getinfo1();
    }

}