package com.example.proj1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.proj1.Model.Employee;
import com.example.proj1.Service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody List<Employee> employee){
        employeeService.save(employee);
        return new ResponseEntity<>("saved", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAll(){
        List<Employee> list = employeeService.getAll();
        return new ResponseEntity<>(list,HttpStatus.OK);

    }
    @GetMapping("/getby/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
       Optional<Employee> list = employeeService.getByID(id);
        return new ResponseEntity<>(list,HttpStatus.OK);

    }

}
