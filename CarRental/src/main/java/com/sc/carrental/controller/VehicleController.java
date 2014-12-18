package com.sc.carrental.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sc.carrental.domain.Vehicle;
import com.sc.carrental.repository.CatgeoryRepository;
import com.sc.carrental.repository.VehicleRepository;



@Controller
@RequestMapping(value="/vehicle")
public class VehicleController {
	
	@Autowired(required=true)
	//@Qualifier(value="vehicle")
	 //private VehicleService vehicle;
    private VehicleRepository vehicle;
   
    @Autowired(required=true)
	//private CategoryService category;
    private CatgeoryRepository category;
	
	@RequestMapping(value="/")
	public String getvehicleList(Model model)
	{
		model.addAttribute("vehicles",vehicle.findAll());
		return "UserCars";
	}
	@RequestMapping(value="/adminDetails", method=RequestMethod.GET)
	public String getvehicleAdminList(Model model)
	{
		model.addAttribute("vehicles",vehicle.findAll());
		return "AdminCars";
	}
	@RequestMapping(value="/deleteCar")
	public String deletevehcleAmin(Model model,HttpServletRequest request, HttpServletResponse response)
	{
		String pull_vehicle=request.getParameter("vehicle");
		vehicle.delete(pull_vehicle);
		return "redirect:/vehicle/adminDetails";
		
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.GET)
	public String getAddCarForm(@ModelAttribute("newVehicle") Vehicle newVehicle, Model model, HttpServletRequest request, HttpServletResponse response) {
		
	model.addAttribute("Categories",category.findAll()) ;
		
	   return "addCar";
	}
	
	@RequestMapping(value="/editCar", method=RequestMethod.GET)
	public String getEditForm(@ModelAttribute("nVehicle") Vehicle newVehicle, Model model, HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("method called");
		String vehicletobind=request.getParameter("vehicle");
		Vehicle v=vehicle.findOne(vehicletobind);
		model.addAttribute("vehicletoedit", v);
		model.addAttribute("Categories",category.findAll()) ;		
		return "editCar";		
	}
	
	@RequestMapping(value="/UserVehicleDetails", method=RequestMethod.GET )
	public String UserCarDetails(Model model,HttpServletRequest request, HttpServletResponse response)
	{
		String vehicletobind=request.getParameter("vehicle");
		Vehicle v=vehicle.findOne(vehicletobind);
		model.addAttribute("vehicle", v);
		model.addAttribute("Categories",category.findAll()) ;
		return "UserVehicleDetails";
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String AddCar(@ModelAttribute("newVehicle") @Valid Vehicle vehicletobeadded, BindingResult result, HttpServletRequest request, final RedirectAttributes redirectatt) {
		if(result.hasErrors()) {
			return "vehicle/addCar";
		}
		
		MultipartFile Image = vehicletobeadded.getImageFile();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
				
			if (Image!=null && !Image.isEmpty()) {
		       try {
		      	Image.transferTo(new File(rootDirectory+"\\resources\\images\\"+vehicletobeadded.getRegistrationNumber() + ".png"));
		       } catch (Exception e) {
				throw new RuntimeException("Vehicle Image saving failed", e);
				 
		   }
		   }
			

		
		String[] suppressedFields = result.getSuppressedFields();		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
		try {
			vehicletobeadded.setVehicleImage("\\resources\\images\\"+vehicletobeadded.getRegistrationNumber() + ".png");
			vehicle.save(vehicletobeadded);
			
		} catch (Exception up) {
	      System.out.println("Transaction Failed!!!");
 
		}		
		redirectatt.addFlashAttribute("message","Successfully added");
	   	return "redirect:/vehicle/addCar";
	}
	
	
}
