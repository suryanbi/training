package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Component
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		
		doc.setPatientList(patientList);
		
		Doctor added = repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}
	}
	
//	public void findAll() {
//		List<Doctor> doctors = repo.findAll();
//		for(Doctor eachDoctor:doctors) {
//			System.out.println("DoctorName:" + eachDoctor.getDoctorName());
//			System.out.println("Department:" + eachDoctor.getDepartment());
//			
//		List<Patient> patients = eachDoctor.getPatientList();
//		for(Patient eachPatient:patients) {
//			System.out.println("PatientName:" + eachPatient.getPatientName());
//			System.out.println("MobileNumber:" + eachPatient.getMobileNumber());
//		}
//		}
	
	public List<Doctor> findAll()
	{
		return this.repo.findAll();
	}
	}


