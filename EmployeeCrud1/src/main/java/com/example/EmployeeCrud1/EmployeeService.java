package com.example.EmployeeCrud1;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}