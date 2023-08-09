package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
//    private static EmployeeRepository employeeRepository;
//    private EmployeeTaxCalculation employeeTaxCalculation;
//
//    @Autowired
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//    public void storeEmployeeDetails(Employee employee) {
//        this.employeeRepository.save(employee);
//    }
//
//    public List<Employee> findEmployeesByFirstName(String firstName) {
//        
//    	return employeeRepository.findByFirstName(firstName);
//    }
// public Employee findEmployeesByID(Long employeeId) {
//        
//	 return employeeRepository.findById(employeeId).orElse(null);
//    }
//    
//    public Employee findEmployeeByEmail(String email) {
//        return employeeRepository.findByEmail(email);
//    }
//    public double calculateTaxAmount(double yearlySalary) {
//    	return EmployeeTaxCalculation.calculateTaxAmount(yearlySalary);
//    }
}