package com.kpi.microservice.currancyexchangeexampleservice.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyExchangeSampleController {
	@GetMapping("/currency-converter/from/{from}/to/{to}/ quantity/{quantity}") 

	public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)  
	{  
		Map<String, String>uriVariables=new HashMap<>();  
		uriVariables.put("from", from);  
		uriVariables.put("to", to);  
		//calling the currency-exchange-service  
		ResponseEntity<CurrencyConversionSampleBean>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean.class, uriVariables);  
		CurrencyConversionSampleBean response=responseEntity.getBody();  
		//creating a new response bean and getting the response back and taking it into Bean  
		return new CurrencyConversionSampleBean(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort(), null, to, to, quantity, quantity, 0);  
		}  
	}  

