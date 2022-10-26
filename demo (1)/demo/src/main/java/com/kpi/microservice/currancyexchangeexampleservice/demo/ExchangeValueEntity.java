package com.kpi.microservice.currancyexchangeexampleservice.demo;

public class ExchangeValueEntity {
     int Id;
     String currency_from;
     String currency_to;
     int conversion_multiple;
	
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCurrency_from() {
		return currency_from;
	}
	public void setCurrency_from(String currency_from) {
		this.currency_from = currency_from;
	}
	public String getCurrency_to() {
		return currency_to;
	}
	public void setCurrency_to(String currency_to) {
		this.currency_to = currency_to;
	}
	public int getConversion_multiple() {
		return conversion_multiple;
	}
	public void setConversion_multiple(int conversion_multiple) {
		this.conversion_multiple = conversion_multiple;
	}
}
