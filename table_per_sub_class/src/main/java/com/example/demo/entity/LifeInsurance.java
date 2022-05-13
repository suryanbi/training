package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="sp_life_insurance")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "policy_number")
public class LifeInsurance extends Insurance{
	
	@Column(name = "age")
	private int age;
	@Column(name = "profile")
	private String profile;
	
	public LifeInsurance(int policyNumber, String polictyHolderName, int age, String profile) {
		super(policyNumber, polictyHolderName);
		this.age = age;
		this.profile = profile;
	}
	
	
	
	

}
