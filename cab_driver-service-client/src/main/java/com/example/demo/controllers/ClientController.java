package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path="/client")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	@Autowired
	private TripDTO dto;
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	}
	@GetMapping(path = "/drivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
	}
	
	@GetMapping(path = "/tripdetails/json")
	public TripDetail[] getTripByDriverIdAsJson() {
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails",TripDetail[].class);
	}
	
	@GetMapping(path = "driver/tripdetails/{id}")
	public String getDrivertripdetails(@PathVariable("id") int id) {
		String driver = this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,String.class);
		String trips = this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/srch/driver/"+id,String.class);
		
		return driver+trips;
	}
	
	@GetMapping(path="/driver/tripdetails/json/{id}")
	public TripDTO getDriverTripDetailsAsJson(@PathVariable("id") int id) {
		
	CabDriver driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, CabDriver.class);
	TripDetail[] trips= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/srch/driver/"+id,TripDetail[].class);
	
	dto.setDriver(driver);
	//List<TripDetail> detail = Arrays.asList(trips); (using List)
	Set<TripDetail> detail = Arrays.stream(trips).collect(Collectors.toSet());   //(using Set)
	dto.setTripdetails(detail);
	
	return dto;
	
	}
}


//	@GetMapping(path="/srch/drivers/{name}")
//	public String getDriversByName(@PathVariable("name") String name) {
//		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name, String.class);
//}
	
	
		
	


