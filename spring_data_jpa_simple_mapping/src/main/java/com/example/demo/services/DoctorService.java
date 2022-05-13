package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService {
	
	private DoctorRepository repo;
	
	@Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo=repo;
	}
	
	public Doctor add(Doctor entity) {
		
		return this.repo.save(entity);
		
	}
	
	public List<Doctor> findAll(){
		
		return this.repo.findAll();
		
	}
	
	public List<Doctor> findByDepartment(String srchString){
		
		return this.repo.findByDepartment(srchString);
		
	}
	
	public Doctor findByDoctorName(String srchString) {
		return this.repo.findByDoctorName(srchString);
	}
	
	public List<Doctor> findByDoctorNameAndDepartment(String docName, String dept){
		return this.repo.findByDoctorNameAndDepartment(docName, dept);
	}
	
	public List<Doctor> getByNameorDept(String docName, String dept){
		return this.repo.getByNameorDept(docName, dept);
	}
}
