package com.Vehicle.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerVehicle {
  @Autowired
  private CarRepo car;
  @Autowired 
  private BikeRepo bike;
  @Autowired
  private TruckRepo truck;
   
  @GetMapping("/car")
  public List<CarEntity> getCar(){
	  return car.getjoin();
	  }
  @GetMapping("truck")
  public List<TruckEntity> getTruck(){
	  return truck.getjoin();
  }
}
