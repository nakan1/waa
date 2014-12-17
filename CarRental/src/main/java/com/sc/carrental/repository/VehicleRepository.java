package com.sc.carrental.repository;

import java.util.List;

import com.sc.carrental.domain.Category;
import com.sc.carrental.domain.Vehicle;

public interface VehicleRepository {
	public void addVehicle(Vehicle vehicle);
	public void updateVehicle(Vehicle vehicle);
	public void delteVehicle(Vehicle vehicle);
	public List<Vehicle> getAllVehicel();
	public Vehicle getVehicleById(String Id);
	public List<Vehicle> getVehicleByCategory(Category category);
}
