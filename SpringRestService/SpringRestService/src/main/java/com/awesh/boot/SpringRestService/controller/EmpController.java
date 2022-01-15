package com.awesh.boot.SpringRestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.awesh.boot.SpringRestService.model.Employee;
import com.awesh.boot.SpringRestService.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("emps")
	public List<Employee> getAllEmps(){
		return empService.getAllEmployee();
	}
	
	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable("id") int empId) {
		
		return empService.getEmployeeById(empId) ;
	}
	
	@PostMapping("/emp")
	public int saveEmp(@RequestBody Employee emp) {
		empService.saveOrUpdate(emp);	
	  return emp.getEmpId();
	}
	
	@DeleteMapping("/emps/{empId}")
	private void deleteEmp(@PathVariable("empId") int bookId){
		empService.delete(bookId);
	}
	
	@PutMapping("/emps")
	private Employee update(@RequestBody Employee emp) {
		empService.saveOrUpdate(emp);
		return emp;
	}
	
	
}
