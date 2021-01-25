package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.model.Employee;
import com.cts.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public boolean registerEmployee(String uname, String password) {
		try {
			if (!(checkExistingEmployee(uname))) {
				Employee emp = new Employee();
				emp.setUname(uname);
				emp.setPassword(password);
				employeeRepository.save(emp);
			}
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	@Override
	public boolean loginEmployee(String uname, String password) {
		Employee emp = employeeRepository.loginEmployee(uname, password);
		if (emp != null)
			return true;
		return false;
	}

	@Override
	public boolean checkExistingEmployee(String uname) {
		Employee emp = employeeRepository.getExistingEmployee(uname);
		if (emp != null)
			return true;
		return false;
	}

}
