package com.sp.sinka.dao;

import java.util.ArrayList;
import java.util.List;

import com.sc.carrental.domain.Category;
import com.sc.carrental.domain.Vehicle;


public class VehicleDAOImpl {
	
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

}
