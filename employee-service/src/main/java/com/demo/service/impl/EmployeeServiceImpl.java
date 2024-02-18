package com.demo.service.impl;

import com.demo.dto.EmployeeDTO;
import com.demo.entity.Employee;
import com.demo.mapper.EmployeeMapper;
import com.demo.repository.EmployeeRepository;
import com.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.MAPPER.MapToEmployee(employeeDTO);
        return EmployeeMapper.MAPPER.MapToEmployeeDTO(employee);
    }
    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        return EmployeeMapper.MAPPER.MapToEmployeeDTO(employee);
    }
}
