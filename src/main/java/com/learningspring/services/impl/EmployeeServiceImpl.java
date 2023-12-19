package com.learningspring.services.impl;

import com.learningspring.models.Employee;
import com.learningspring.repositories.EmployeeRepository;
import com.learningspring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee fetchEmployeeById(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        return employeeOptional.orElse(null);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployeeDetails(Employee employee, Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            Employee tempEmployee = new Employee();
            tempEmployee.setId(employee.getId());
            tempEmployee.setFirstName(employee.getFirstName());
            tempEmployee.setLastName(employee.getLastName());
            tempEmployee.setEmail(employee.getEmail());
            tempEmployee.setPhoneNumber(employee.getPhoneNumber());
            tempEmployee.setSalary(employee.getSalary());
            employeeRepository.save(tempEmployee);
            return tempEmployee;
        }
        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            employeeRepository.delete(employeeOptional.get());
            return "Successfully Deleted!";
        }
        return null;
    }
}
