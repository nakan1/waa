package com.sc.carrental.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sc.carrental.domain.Vehicle;
import com.sc.carrental.service.CategoryService;
import com.sc.carrental.service.VehicleService;



@Controller
public class VehicleController {
	
	/*@Autowired(required=true)
	@Qualifier(value="vehicle")
	 private VehicleService vehicle;
    
   
    public void setPersonService(PersonService ps){
        this.personService = ps;
    }
    @Autowired(required=true)
	private CategoryService category;
	
	@RequestMapping(value="/")
	public String getvehicleList(Model model)
	{
		model.addAttribute("vehicles",vehicle.getAllVehicel());
		return "cars";
	}
	
	
	@RequestMapping(value = "/addCar", method = RequestMethod.GET)
	public String getAddCarForm(@ModelAttribute("newVehicle") Vehicle newVehicle, Model model) {
		model.addAttribute("Categories",category.getAllCategory()) ;
		
	   return "addCar";
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String AddCar(@ModelAttribute("newVehicle") @Valid Vehicle vehicletobeadded, BindingResult result, HttpServletRequest request, final RedirectAttributes redirectatt) {
		if(result.hasErrors()) {
			return "addCar";
		}
		String[] suppressedFields = result.getSuppressedFields();		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
		try {
			vehicle.addVehicle(vehicletobeadded);
		} catch (Exception up) {
	      System.out.println("Transaction Failed!!!");
 
		}		
		redirectatt.addFlashAttribute("message","Successfully added");
	   	return "redirect:/cars";
	}
	*/

}
