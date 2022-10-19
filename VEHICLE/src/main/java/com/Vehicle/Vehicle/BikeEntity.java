package com.Vehicle.Vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class BikeEntity {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer Bike_id;
	    private String Bike_name;
	    private Integer No_OfTyres;
		public Integer getBike_id() {
			return Bike_id;
		}
		public void setBike_id(Integer bike_id) {
			Bike_id = bike_id;
		}
		public String getBike_name() {
			return Bike_name;
		}
		public void setBike_name(String bike_name) {
			Bike_name = bike_name;
		}
		public Integer getNo_OfTyres() {
			return No_OfTyres;
		}
		public void setNo_OfTyres(Integer no_OfTyres) {
			No_OfTyres = no_OfTyres;
		}
}