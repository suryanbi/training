package com.employeeservice;

import com.employee.Employee;

public class EmployeeService {
	
	public double CalculateBonus(Employee object) {
		
		double bonus = object.getSalary();
		return 0.33*bonus;
		
	}
	
	
}
