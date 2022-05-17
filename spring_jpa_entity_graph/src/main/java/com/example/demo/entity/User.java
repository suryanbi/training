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
@Table(name ="sp_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String userName;
	@Column(name="phone_number")
	private long phoneNumber;

}
