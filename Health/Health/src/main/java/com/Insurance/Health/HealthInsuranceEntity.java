package com.Insurance.Health;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HealthInsurance")

public class HealthInsuranceEntity 
 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Client_id;
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
	public String getPolicy_plan() {
		return Policy_plan;
	}
	public void setPolicy_plan(String policy_plan) {
		Policy_plan = policy_plan;
	}
	private String Client_name;
    private String Policy_plan;
   {

}
}