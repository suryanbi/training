package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.utility.PassengerService;

@RestController
@RequestMapping(path = "/api/v1")
public class PassengerController {
	
	private PassengerService service;
	
	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/passenger")
	public List<Passenger> getAllPassenger(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path="/passenger/name/{name}")
	public Passenger findByPassengerName(@PathVariable("name")String name) {
		return this.service.findByPassengerName(name);
	}
	
	@GetMapping(path="/passenger/tripDateTime/{dateTime}")
		public Passenger findByTripDateTime(@PathVariable("tripDateTime") 	@DateTimeFormat(iso = ISO.DATE_TIME)
LocalDateTime dateTime) {
		return this.service.findByTripDateTime(dateTime);
	}
	
	

}
