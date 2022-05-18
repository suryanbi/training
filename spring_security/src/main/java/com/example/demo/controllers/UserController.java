package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {
	
//	@GetMapping(path = "/users")         //(print with roles)
//	public String getUser(Principal principal) {
//		
//		System.out.println("User:"+principal.getName());
//		System.out.println(principal.toString());
//		return "User Bhat";
//	}
	
	@GetMapping(path = "/users") 
	@RolesAllowed(value= {"ROLE_ADMIN"})
	public String getUser() {
		
		
		return "User Bhat";
	}
	
	@GetMapping(path = "/users/{id}")
	@RolesAllowed(value= {"ROLE_ADMIN","ROLL_GUEST"})
	public String getUsersById(@PathVariable int id) {
		
		if(id==1) {
		return "User Bhat";
	}else {
		return "Manager Magesh";
		}
	}
	
	

}
