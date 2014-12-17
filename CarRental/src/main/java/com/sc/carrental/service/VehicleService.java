package com.sc.carrental.service;

import java.util.List;

import com.sc.carrental.domain.Category;
import com.sc.carrental.domain.Vehicle;


public interface VehicleService {
		public void addVehicle(Vehicle vehicle);
		public void updateVehicle(Vehicle vehicle);
		public void delteVehicle(Vehicle vehicle);
		public List<Vehicle> getAllVehicel();
		public Vehicle getVehicleById(String Id);
		public List<Vehicle> getVehicleByCategory(Category category);
}
