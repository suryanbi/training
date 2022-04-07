package com.main;

import com.customer.Customer;
import com.employee.Employee;
import com.employeeservice.EmployeeService;
import com.hotel.Hotel;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ramesh = new Customer( 1,  "ramesh",  22,  "male");
	
		
		System.out.println("Age:"+ramesh.getAge());
		System.out.println("ID:"+ramesh.getId());
		System.out.println("Gender:"+ramesh.getGender());
		System.out.println("Name:"+ramesh.getName());
		
		Employee star = new Employee(2, "star", 22, 25432);
		
		System.out.println("ID:"+star.getId());
		System.out.println("Name:"+star.getName());
		System.out.println("Age:"+star.getAge());
		System.out.println("Salary:"+star.getSalary());
		
		Hotel light = new Hotel("Moon", 411, "Moonar");
		
		System.out.println("Name:"+light.getHotelName());
		System.out.println("Room Number:"+light.getRoomNumber());
		System.out.println("Place:"+light.getPlace());
		
	
		EmployeeService bonus = new EmployeeService();
		System.out.println("Employee bonus:"+bonus.CalculateBonus(star));
		
		
		

	}

}
