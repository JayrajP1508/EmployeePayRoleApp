package com.example.EmployeePayroleApp.Repository;

import com.example.EmployeePayroleApp.Model.Employee;
import com.example.EmployeePayroleApp.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
