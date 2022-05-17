package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="sp_driver")
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	@Id
	@Column(name="driver_id")
	int driverId;
	@Column(name="driver_name")
	String driverName;
	@Column(name="mobile_number")
	long mobileNumber;
	@Column(name="rating")
	double rating;
	

}
