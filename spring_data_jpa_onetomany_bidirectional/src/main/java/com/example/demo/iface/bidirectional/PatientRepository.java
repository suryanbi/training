package com.example.demo.iface.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirectional.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
