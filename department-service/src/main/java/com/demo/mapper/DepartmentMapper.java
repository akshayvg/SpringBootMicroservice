package com.demo.mapper;

import com.demo.dto.DepartmentDTO;
import com.demo.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);
    Department MapToDepartment(DepartmentDTO departmentDTO);
    DepartmentDTO MapToDepartmentDTO(Department department);
}
