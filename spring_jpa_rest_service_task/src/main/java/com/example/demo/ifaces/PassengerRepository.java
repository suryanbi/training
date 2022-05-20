package com.example.demo.ifaces;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
	public Passenger findByPassengerName(String name);
	
	public Passenger findByTripHistoryTripDateTime(LocalDateTime dateTime);

}
