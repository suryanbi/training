package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository repo;
	
	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		
		return this.repo.save(entity);
	}
	
	public Iterable<Employee> findAll() {
		return this.repo.findAll();
	}
	
	public List<Employee> findByDateOfBirth(LocalDate localDate) {
		return this.repo.findByDateOfBirth(localDate);
	}
	
	public List<Employee> findByLocation(String srchString) {
		return  this.repo.findByLocation(srchString);
	}
	
	public List<Employee> findBySkillSet(String srchString){
		return this.repo.findBySkillSet(srchString);
	}
	
	public List<Employee> findByempLocorempSkill(String srchString, String srchString1){
		return this.repo.findByempLocorempSkill(srchString, srchString1);
	}
	
	public List<Employee> findByLocationAndSkillSet(String srchLocation, String srchSkillSet){
		return this.repo.findByLocationAndSkillSet(srchLocation, srchSkillSet);
	}
	
	

}
