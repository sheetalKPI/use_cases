package com.Insurance.Health;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HealthInsuranceRepo extends JpaRepository<HealthInsuranceEntity,Integer>{
	@Query(value = "Select *  from healthinsurance", nativeQuery = true)
	List<HealthInsuranceEntity> getjoin();

}
