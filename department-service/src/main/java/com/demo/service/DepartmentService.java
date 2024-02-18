package com.demo.service;

import com.demo.dto.DepartmentDTO;
import com.demo.entity.Department;

public interface DepartmentService {
    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);
    DepartmentDTO getDepartmentByCode(String departmentCode);
}
