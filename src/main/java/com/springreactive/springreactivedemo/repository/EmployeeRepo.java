package com.springreactive.springreactivedemo.repository;

import com.springreactive.springreactivedemo.domain.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepo extends ReactiveMongoRepository<Employee,String> {
}
