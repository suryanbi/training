package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepostiory extends JpaRepository<CabDriver, Integer> {

	CabDriver findByDriverName(String qryName);
}
