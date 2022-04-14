package com.training.model1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.Patient;
import com.training.model.Doctor;

public class Appointment {
	private Map<Doctor,Set<Patient>> map;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
		
		map = new HashMap<>();
	}

	public Appointment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}

	public Map<Doctor, Set<Patient>> getMap() {
		return map;
	}

	public void setMap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}
	
	public Set<Patient> getPatients(Doctor key){
		
		return this.map.get(key);
	}
	

	
}
