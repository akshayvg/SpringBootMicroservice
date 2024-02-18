package com.demo.controller;

import com.demo.dto.EmployeeDTO;
import com.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<EmployeeDTO> handlePost(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }
    @GetMapping("{employeeId}")
    public ResponseEntity<EmployeeDTO> handleGetById(@PathVariable("employeeId") Long employeeId){
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
    }
}
