package com.demo.controller;

import com.demo.dto.DepartmentDTO;
import com.demo.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/departments")
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<DepartmentDTO> handlePost(@RequestBody DepartmentDTO departmentDTO){
        return new ResponseEntity<>(departmentService.saveDepartment(departmentDTO), HttpStatus.CREATED);
    }
    @GetMapping("{departmentCode}")
    public ResponseEntity<DepartmentDTO> handleGetByDepartmentCode(@PathVariable("departmentCode") String departmentCode){
        return new ResponseEntity<>(departmentService.getDepartmentByCode(departmentCode),HttpStatus.OK);
    }

}
