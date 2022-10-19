package com.Vehicle.Vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")

public class TruckEntity {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer Truck_id;
	    private String Truck_name;
	    private Integer NoOFTyres;
		public Integer getTruck_id() {
			return Truck_id;
		}
		public void setTruck_id(Integer truck_id) {
			Truck_id = truck_id;
		}
		public String getTruck_name() {
			return Truck_name;
		}
		public void setTruck_name(String truck_name) {
			Truck_name = truck_name;
		}
		public Integer getNoOFTyres() {
			return NoOFTyres;
		}
		public void setNoOFTyres(Integer noOFTyres) {
			NoOFTyres = noOFTyres;
		}
}