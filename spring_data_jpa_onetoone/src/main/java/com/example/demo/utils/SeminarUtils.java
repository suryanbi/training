package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {
	
	@Autowired
	Speaker speaker;
	
	@Autowired
	Seminar obj;
	
	@Autowired
	SeminarRepository repo;
	
public void create() {
	obj.setSpeaker(speaker);
	Seminar added = repo.save(obj);
	if(added!=null) {
		System.out.println("One Record Added");
	}
}
public void findAll() {
	repo.findAll().forEach(System.out::println);
}
}
