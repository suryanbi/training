package com.example.demo.utility;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.ifaces.PassengerRepository;


@Service
public class PassengerService {
	
	
	@Autowired
	PassengerRepository repo;
	

	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Passenger add(Passenger entity) {
		return this.repo.save(entity);
	}
	
	public List<Passenger> findAll() {
		return this.repo.findAll();
	}
	
	public Passenger findByPassengerName(String name) {
		return this.repo.findByPassengerName(name);
	}
	
	public Passenger findByTripDateTime(LocalDateTime dateTime) {
		return this.repo.findByTripHistoryTripDateTime(dateTime);
	}

	
	
	
	
	
	
	
	
	

}
