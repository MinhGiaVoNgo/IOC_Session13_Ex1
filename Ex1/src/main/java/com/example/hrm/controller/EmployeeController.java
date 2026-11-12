package com.example.hrm.controller;

import com.example.hrm.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = List.of(
                new Employee(1L, "Nguyen Van An", 1500.0),
                new Employee(2L, "Tran Thi Binh", 2000.0),
                new Employee(3L, "Le Van Cuong", 2500.0)
        );
        return ResponseEntity.ok(employees);
    }
}
