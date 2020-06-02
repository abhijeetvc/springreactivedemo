package com.springreactive.springreactivedemo.controller;

import com.springreactive.springreactivedemo.domain.Employee;
import com.springreactive.springreactivedemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/save")
    public Mono<Employee> saveData(@RequestBody Employee employee){
        Mono<Employee> e=employeeRepo.save(employee);
        return e;
    }

    @PostMapping(value="/save1")
    public String saveData1(@RequestBody Employee employee){
      Mono<Employee> e= employeeRepo.save(employee);
        return "Saved";
    }

    @GetMapping(value="/emp/{id}")
    public Mono<Employee> getEmp(@PathVariable String id){
        Mono<Employee> e=employeeRepo.findById(id);
        return e;
    }

}
