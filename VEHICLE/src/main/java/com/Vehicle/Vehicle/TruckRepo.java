package com.Vehicle.Vehicle;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity, Integer>{

	@Query(value = "select * from truck t join car c on t.no_of_tyres = c.no_of_tyres", nativeQuery)
	public List<TruckEntity> getjoin();


}
