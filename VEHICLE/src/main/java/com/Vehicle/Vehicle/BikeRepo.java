package com.Vehicle.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepo  extends JpaRepository<BikeEntity, Integer>{

	@Query(value = "select * from bike b join car c on b.no_of_tyres = c.no_of_tyres")	
	public List<CarEntity> getjoin();
 

}