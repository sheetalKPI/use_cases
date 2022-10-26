package com.kpi.microservice.currancyexchangeexampleservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication  
@EnableFeignClients("com.kpi.microservice.currancyexchangeexampleservice.demo;") 
public class CurrencyConversionSampleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CurrencyConversionSampleApplication.class, args);  
	}

}
