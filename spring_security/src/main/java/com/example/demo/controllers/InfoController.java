package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@GetMapping(path = "/info")
	public String getInfo() {
		return "Un Secured EndPoint";
	}

}
