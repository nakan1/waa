package com.sc.carrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.carrental.domain.Category;
import com.sc.carrental.domain.Vehicle;
import com.sc.carrental.repository.VehicleRepository;
import com.sc.carrental.service.VehicleService;


@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired 
	private VehicleRepository vehicleDAO;
	
	public List<Vehicle> getAllVehicel()
	{
		return vehicleDAO.getAllVehicel();
	}
	
	public void addVehicle(Vehicle vehicle)
	{
		vehicleDAO.addVehicle(vehicle);
	}
	public void updateVehicle(Vehicle vehicle)
	{
		vehicleDAO.updateVehicle(vehicle);
	}
	public void delteVehicle(Vehicle vehicle)
	{
		vehicleDAO.delteVehicle(vehicle);
	}
	public List<Vehicle> getAllVehicle()
	{
		return vehicleDAO.getAllVehicel();
	}
	public Vehicle getVehicleById(String Id)
	{
		return vehicleDAO.getVehicleById(Id);
	}
	public List<Vehicle> getVehicleByCategory(Category category)
	{
		return vehicleDAO.getVehicleByCategory(category);
	}
}
