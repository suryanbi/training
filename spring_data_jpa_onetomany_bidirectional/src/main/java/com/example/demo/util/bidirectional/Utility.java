package com.example.demo.util.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.iface.bidirectional.DoctorRepository;
import com.example.demo.iface.bidirectional.PatientRepository;



@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		
		for(Patient eachPatient : patientList) {
			eachPatient.setDoctor(doc);
			patientRepo.save(eachPatient);
		}
		
		Doctor added = repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}
		
	}
	public void findAll() {
		List<Doctor> doctors = repo.findAll();
		for(Doctor eachDoctor:doctors) {
			System.out.println("DoctorName:" + eachDoctor.getDoctorName());
			System.out.println("Department:" + eachDoctor.getDepartment());
			
		List<Patient> patients = eachDoctor.getPatientList();
		for(Patient eachPatient:patients) {
			System.out.println("PatientName:" + eachPatient.getPatientName());
			System.out.println("MobileNumber:" + eachPatient.getMobileNumber());
		}
		}	
		}
	
	public void findDoctorFrmPatient() {
		
		Patient entity = patientRepo.findById(111).get();
		
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
	

}
