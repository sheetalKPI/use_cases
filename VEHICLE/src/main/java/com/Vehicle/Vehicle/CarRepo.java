package com.Vehicle.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepo extends JpaRepository<CarEntity, Integer>{
		@Query(value = "select * from truck t join car ")	
		public List<CarEntity> getjoin();
}
