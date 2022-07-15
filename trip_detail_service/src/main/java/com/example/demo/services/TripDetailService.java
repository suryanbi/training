package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repo.TripDetailRepository;

@Service
public class TripDetailService {
	
	private TripDetailRepository repo;

	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	public TripDetail add(TripDetail entity) {
		return this.repo.save(entity);
	}
	
	public List<TripDetail> findAll(){
		return  this.repo.findAll();
	}
	
	public List<TripDetail> findTripByDriverId(int id) {
		return this.repo.findByDriverId(id);
	}
	
	

}
