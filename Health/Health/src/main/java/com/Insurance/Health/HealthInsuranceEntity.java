package com.Insurance.Health;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="healthinsurance")

public class HealthInsuranceEntity 
 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Client_id;
    private String Client_name;
    private String Policy_name;
    private Integer age;
    private Integer Insured_amount;
    private String Discount_perc;
    private Integer Premium_amount;
    private Integer Years;
	public Integer getClient_id() {
		return Client_id;
	}
	public void setClient_id(Integer client_id) {
		Client_id = client_id;
	}
	public String getClient_name() {
		return Client_name;
	}
	public void setClient_name(String client_name) {
		Client_name = client_name;
	}
	public String getPolicy_name() {
		return Policy_name;
	}
	public void setPolicy_name(String policy_name) {
		Policy_name = policy_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getInsured_amount() {
		return Insured_amount;
	}
	public void setInsured_amount(Integer insured_amount) {
		Insured_amount = insured_amount;
	}
	public String getDiscount_perc() {
		return Discount_perc;
	}
	public void setDiscount_perc(String discount_perc) {
		Discount_perc = discount_perc;
	}
	public Integer getPremium_amount() {
		return Premium_amount;
	}
	public void setPremium_amount(Integer premium_amount) {
		Premium_amount = premium_amount;
	}
	public Integer getYears() {
		return Years;
	}
	public void setYears(Integer years) {
		Years = years;
	}
    
}