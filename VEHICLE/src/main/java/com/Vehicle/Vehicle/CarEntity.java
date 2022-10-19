package com.Vehicle.Vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Car")
public class CarEntity {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer Car_id;
	    private String Car_name;
	    private Integer NoOfTyres;
	
	   public Integer getId() {
		return Car_id;
	}

	public void setId(Integer id) {
		this.Car_id = Car_id;
	}

	public String getCar_name() {
		return Car_name;
	}

	public void setCar_name(String car_name) {
		Car_name = car_name;
	}

	public int getNoOfTyres() {
		return NoOfTyres;
	}

	public int setNoOfTyres(int noOfTyres) {
		NoOfTyres = noOfTyres;
		 return NoOfTyres;
	}

}
