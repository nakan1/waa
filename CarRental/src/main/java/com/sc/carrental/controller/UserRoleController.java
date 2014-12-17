package com.sc.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.carrental.domain.UserRoles;

@Controller
@RequestMapping("/UserRole")
public class UserRoleController {
	
	public String add(@ModelAttribute UserRoles userRole){
		
		return "addUser"; 
		
	}

}
