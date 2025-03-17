package com.example.EmployeePayroll.Interface;

import com.example.EmployeePayroll.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int id, Employee updatedEmployee);
    void deleteEmployee(int id);
}