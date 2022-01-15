package com.awesh.boot.SpringRestService.repository;

import org.springframework.data.repository.CrudRepository;

import com.awesh.boot.SpringRestService.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
