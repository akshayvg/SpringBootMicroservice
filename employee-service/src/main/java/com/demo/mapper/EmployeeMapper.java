package com.demo.mapper;

import com.demo.dto.EmployeeDTO;
import com.demo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    Employee MapToEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO MapToEmployeeDTO(Employee employee);
}
