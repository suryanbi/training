package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;


@SpringBootApplication
public class SpringJpaRestServiceTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run
				(SpringJpaRestServiceTaskApplication.class, args);
		
		
		
	}
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			
			
			
			@Autowired
			PassengerRepository repo;
			
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
				Passenger pas = new Passenger();
				pas.setPassengerId(200);
				pas.setPassengerName("Somesh");
				pas.setEmail("somesh@");
				pas.setLocation("Chennai");
				
				List<TripHistory> trip = Arrays.asList(new TripHistory(400, 
					LocalDateTime.of(2022, 04, 18, 1, 30), "Chennai", "Bangalore", 600));
				
				pas.setTripHistory(trip);
				
				repo.save(pas);
				
				
			}};
	


}}
