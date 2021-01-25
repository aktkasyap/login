package com.cts.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE e.uname = ?1")
	Employee getExistingEmployee(String uname);

	@Query("SELECT e FROM Employee e WHERE e.uname = ?1 and e.password = ?2")
	Employee loginEmployee(String uname, String password);

}
