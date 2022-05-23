package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@Component
public class Client {
	
	//String BASEURL = "http://10.90.3.195:8060/api/v1/drivers";
	String BASEURL = "http://localhost:8080/api/v1/users";
	
	private RestTemplate template;
	
	@Autowired
	public Client(RestTemplate template) {
		super();
		this.template = template;
	}
	
	public String invokeGetAll() {
		return template.getForObject(BASEURL,String.class);
	}
	
	public Driver[] invokeGetAllAsObject() {
		return template.getForObject(BASEURL,Driver[].class);
	}
	
	public void add() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
//		int driverId;
//		String driverName;
//		long mobileNumber;
//		double rating;
		
		HashMap<String, Object> map = new HashMap<>();
		
//		map.put("driverName", "Somesh");
//		map.put("driverId", 205);
//		map.put("mobileNumber", 8976589);
//		map.put("rating", 4.6);
		
		HttpEntity<Map<String,Object>> entity = new HttpEntity(map,header);
		
		ResponseEntity<Driver> resp = this.template.postForEntity(BASEURL, entity, Driver.class);
		
		System.out.println("Status Code:"+ resp.getStatusCodeValue());
		System.out.println("Body" + resp.getBody());
		System.out.println("Location:" +resp.getHeaders().getLocation());
		
		
		

	}
	
	

}
