package com.cts.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}

	@GetMapping(value = "/registerpage")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("register");
	}

}
