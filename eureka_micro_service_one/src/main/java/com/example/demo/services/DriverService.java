package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

@Service
public class DriverService {
	
	
	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Driver> findAll() {
		
		return this.repo.findAll();
	}

	

	public Driver add(Driver entity) {
		
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException(id+ "Not found"));
	}

	public void deleteById(int id) {
		 this.repo.deleteById(id);
		 
	}
	
	public List<Driver> findByDriverName(String srchName) {
		return this.repo.findByDriverName(srchName);
	}
	
	public List<Driver> srchByMobileNumber(long srchNumber){
		return this.repo.findByMobileNumber(srchNumber);
	}
	
	public List<Driver> srchByDriverRating(double rating){
		return this.repo.searchByRating(rating);
	}
	
	public int updatedRating(int id, double updatedRating) {
		return this.repo.modifyRating(id, updatedRating);
	}
	
	public List<Driver> sortedList(String name){
		return this.repo.findAll(Sort.by(name));
	}
	
	
	

}
