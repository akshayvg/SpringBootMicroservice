package com.demo.service;

import com.demo.dto.EmployeeDTO;
import com.demo.entity.Employee;

public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployeeById(Long employeeId);
}
