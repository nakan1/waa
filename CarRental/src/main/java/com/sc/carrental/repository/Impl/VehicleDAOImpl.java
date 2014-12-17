package com.sc.carrental.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sc.carrental.domain.Category;
import com.sc.carrental.domain.Vehicle;
import com.sc.carrental.repository.VehicleRepository;

@Repository
public class VehicleDAOImpl implements VehicleRepository {
	
	public void addVehicle(Vehicle vehicle){}
	public void updateVehicle(Vehicle vehicle){}
	public void delteVehicle(Vehicle vehicle){}
	
	public List<Vehicle> getAllVehicle(){
	 List<Vehicle> vehicles=new ArrayList<Vehicle>();
	Vehicle camry=new Vehicle();
		return vehicles;
	}
	
	public Vehicle getVehicleById(String Id){
		Vehicle vehicle=new Vehicle();
		return vehicle;
	}
	public List<Vehicle> getVehicleByCategory(Category category){
		List<Vehicle> vehicles=new ArrayList<Vehicle>();	
		return vehicles;
	}
	@Override
	public List<Vehicle> getAllVehicel() {
		// TODO Auto-generated method stub
		return null;
	}

}
