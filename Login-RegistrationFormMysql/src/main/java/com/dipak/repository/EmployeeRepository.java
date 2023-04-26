package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dipak.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByLoginIdAndPassword(String loginId, String password);


}
