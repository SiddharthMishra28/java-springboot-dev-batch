package com.learningspring.services;

import com.learningspring.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee fetchEmployeeById(Long id);
    List<Employee> fetchAllEmployees();
    Employee createEmployee(Employee employee);
    Employee updateEmployeeDetails(Employee employee, Long id);
    String deleteEmployee(Long id);
}
