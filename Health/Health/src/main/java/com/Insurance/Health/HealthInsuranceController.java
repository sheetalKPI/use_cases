package com.Insurance.Health;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthInsuranceController {
	@Autowired
	private HealthInsuranceRepo HIr;
	@GetMapping("/details") 
    public List<HealthInsuranceEntity> getdetails(){
    	    	
		return  HIr.getjoin();
    }
	
  @GetMapping("/Discount_perc/{result}/{Premium_amount")
  public int Discount_perc(@PathVariable String result, @PathVariable int Premium_amount)
  {
	  final String more = "morethanfive";
	  final String less = "lessthanfive";
	  final String equal = "equalfive";
	  int discount = 0;
	  if(result.equals(less)) {
		  return Premium_amount;
	  }
	 
	  else if(result.equals(equal)) {
		  discount = 10*Premium_amount/100;
		  return Premium_amount-discount;
	  }
	  else if(result.equals(more)) {
		  discount = 12*Premium_amount/100;
		  return Premium_amount-discount;
  }
	return Premium_amount-discount;
}
}