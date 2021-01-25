package com.cts.employee.service;

public interface EmployeeService {

	public boolean registerEmployee(String uname, String password);

	public boolean loginEmployee(String uname, String password);

	public boolean checkExistingEmployee(String uname);

}
