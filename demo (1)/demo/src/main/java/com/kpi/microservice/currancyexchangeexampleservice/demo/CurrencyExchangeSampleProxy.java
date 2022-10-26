package com.kpi.microservice.currancyexchangeexampleservice.demo;

import org.springframework.cloud.openfeign.FeignClient;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service") 
public interface CurrencyExchangeSampleProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	public CurrencyConversionSampleBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to); //from map to USD and to map to INR  
	}  

