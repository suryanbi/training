package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate localDate);
	
	public List<Employee> findByLocation(String srch);
	
	public List<Employee> findBySkillSet(String srch);
	
	
	@Query(nativeQuery = true,
			value = "select employee_id,employee_name, date_of_birth, location, skill_set,"
					+ "phone_number from sp_employee where location=:empLoc or skill_set=:empSkill")
	public List<Employee> findByempLocorempSkill(@Param("empLoc") String empLoc
			,@Param("empSkill") String empSkill);
	
	public List<Employee> findByLocationAndSkillSet(String srchLocation, String srchSkillSet);
	

}
