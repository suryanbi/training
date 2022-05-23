package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {
	
	private DriverService service;
	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/drivers")
	public List<Driver> getAllDrivers(){
		
		return this.service.findAll();
	}
	
//	@PostMapping(path ="/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		
//		return this.service.add(entity);
//	}
	
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id){
		
		return this.service.findById(id);
	}
	
	@PostMapping(path ="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		
		Driver driver = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(entity.getDriverId())
				.toUri();
		 
		return ResponseEntity.created(location).body(driver);

		
		//return ResponseEntity.status(201).body(driver);
		
		//return ResponseEntity.status(HttpStatus.CREATED).body(driver);
	}
	
	@DeleteMapping(path="/drivers/{id}")
	public ResponseEntity<String> deleteDriverById(@PathVariable("id") int id) {
		 try {
			this.service.deleteById(id);
			return ResponseEntity.status(HttpStatus.CREATED).body("One Record Deleted");
		} catch (Exception e) {
			
		return ResponseEntity.status(204).body("Not found");
		}
		 
	}
	
	@GetMapping(path="/drivers/srch/phone/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long number) {
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path="/drivers/srch/name/{driverName}")
	public List<Driver> getDriverByDriverName(@PathVariable("driverName") String srchName) {
		return this.service.findByDriverName(srchName);
	}
	
	@GetMapping(path="/drivers/srch/rating/{driverRating}")
	public List<Driver> getDriverByDriverRating(@PathVariable("driverRating") double rating) {
		return this.service.srchByDriverRating(rating);
	}
	
	@PutMapping(path="/drivers/id/rating/{id}/{rating}")
	public ResponseEntity<Object> updatedRating(@PathVariable("id")int id,@PathVariable("rating") double updatedRating){
		int update=this.service.updatedRating(id, updatedRating);
		return ResponseEntity.status(200).body("UpdatedRating" +update);
	}
	
	@GetMapping(path="/drivers/sort/{name1}")
	public List<Driver> getDriverBySortedList(@PathVariable("name1") String name){
		return this.service.sortedList(name);
	}
	
	
	
	
	
	
	

}
