package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.TripDetail;
import com.example.demo.services.TripDetailService;

@RestController
@RequestMapping(path="/api/v1/tripdetails")
public class TripDetailController {
	
	@Autowired
	private TripDetailService service;
	
	@PostMapping
	public TripDetail add(@RequestBody TripDetail entity) {
		return this.service.add(entity);
		
	}
	
	@GetMapping
	public List<TripDetail> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/srch/driver/{id}")
	public List<TripDetail> findByDriverId(@PathVariable ("id")int id) {
		return this.service.findTripByDriverId(id);
	}
	
	
}
