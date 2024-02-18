package com.demo.repository;

import com.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department getDepartmentByDepartmentCode(String departmentCode);
}
