package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	public StudentRestController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("StudentRestController.StudentRestController()");
	}
public String getEmployee() {
	return "Hi";
}
	public String getEmployeeAdded() {
	return "Hi";
}

	public String getEmployeeAddedTwo() {
	return "Hi123";
}
	public String getEmployeeAddedTwo4() {
		return "Hi123";
	}

	public String getEmployeeAddedFive() {
	return "Hi0123455";
}
}
