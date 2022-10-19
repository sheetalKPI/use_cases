package com.Vehicle.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepo extends JpaRepository<CarEntity, Integer>{
		@Query(value = "select * from car c join truck t on c.no_of_tyres = t.no_of_tyres")	
		public List<CarEntity> getjoin();
}
