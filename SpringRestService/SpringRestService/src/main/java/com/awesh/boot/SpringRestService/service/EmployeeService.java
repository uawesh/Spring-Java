package com.awesh.boot.SpringRestService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awesh.boot.SpringRestService.model.Employee;
import com.awesh.boot.SpringRestService.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository EmployeeRepository;
	
	public List<Employee> getAllEmployee(){
		List<Employee> Employees=new ArrayList<>();
		EmployeeRepository.findAll().forEach(Employees1->Employees.add(Employees1));
		return Employees;
	}
	
	public Employee getEmployeeById(int id) {
		return EmployeeRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Employee Employee) {
		EmployeeRepository.save(Employee);
	}
	
	public void delete(int id) {
		EmployeeRepository.deleteById(id);
	}
	
	public void update(Employee Employee,int EmployeeId) {
		EmployeeRepository.save(Employee);
	}
}
