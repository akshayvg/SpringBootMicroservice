package com.demo.service.impl;

import com.demo.dto.DepartmentDTO;
import com.demo.entity.Department;
import com.demo.mapper.DepartmentMapper;
import com.demo.repository.DepartmentRepository;
import com.demo.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        Department department = DepartmentMapper.MAPPER.MapToDepartment(departmentDTO);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.MAPPER.MapToDepartmentDTO(savedDepartment);
    }
    @Override
    public DepartmentDTO getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.getDepartmentByDepartmentCode(departmentCode);
        return DepartmentMapper.MAPPER.MapToDepartmentDTO(department);
    }
}
