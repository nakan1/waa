package com.sc.carrental.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sc.carrental.domain.User;
import com.sc.carrental.domain.UserRoles;
import com.sc.carrental.repository.UserRepository;
import com.sc.carrental.repository.UserRoleRepository;
import com.sc.carrental.service.UserService;
import com.sc.carrental.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	
	/*@Autowired(required=true)
	@Qualifier("1")
	private UserService userService;*/
	//UserService userService = new UserServiceImpl();
	
	/* @Autowired(required=true)
	    @Qualifier(value="personService")
	    public void setPersonService(PersonService ps){
	        this.personService = ps;
	    }*/
	
	@Autowired
	private UserRepository userRepo;
	private UserRoleRepository userRoleRepo;
	
	
	//get sing
	@RequestMapping(value="addUser", method=RequestMethod.GET)
	public String signup(@ModelAttribute("newUser") User user, Model model){
		
		return "addUser";
	}
	
	@RequestMapping(value="addUser", method= RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("newUser") User user, BindingResult result, Model model){
		if(result.hasErrors()){
			System.out.println(result.getObjectName());
			return "addUser";
		}
		 model.addAttribute("insertionMessage", "UserInserted");
		
		 userRepo.save(user);
		 
		 
		 //ecreating list for of roles 
		/* UserRoles userRoles = null;
		 	List<String> listUserRole =  user.getRole();
		 	for(String ur: listUserRole){
		 		userRoles = new UserRoles();
		 		userRoles.setRole(ur);
		 		userRoleRepo.save(userRoles);
		 	}*/
		 	
		 
		
		return "redirect:/users/addUser";
	}
	
	
	@RequestMapping("/edit")
	public String getAll(@ModelAttribute("newUser") User user, Model model){
			model.addAttribute("listUsers", userRepo.findAll());
		return "users";
	}
	
	
	 @RequestMapping("/remove/{id}")
	    public String removePerson(@Valid @PathVariable("id") String id, User user, BindingResult result){
	         
	        this.userRepo.delete(id); 
	        return "redirect:/users";
	    }
	  
	    @RequestMapping("/edit/{username}")
	    public String editPerson(@Valid @PathVariable("username") String id, Model model,@ModelAttribute("newUser") User user, BindingResult result){
	        model.addAttribute("user", userRepo.findOne(id));
	        model.addAttribute("listUsers", userRepo.findAll());
	        return "users";
	    }
	
	
}
