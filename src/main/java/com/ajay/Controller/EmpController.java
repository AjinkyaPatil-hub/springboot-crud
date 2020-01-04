package com.ajay.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.Service.EmpServiceImpl;
import com.ajay.entity.EmpEntity;

@RestController
@RequestMapping(value="/empInfo")
public class EmpController {

	@Autowired
	EmpServiceImpl service;
	
	@GetMapping(value="/")
	public List<EmpEntity> getAllEmp(){
		return service.fetchAllEmp();
	}

	@GetMapping(value="/{id}")
	public EmpEntity getEmp(@PathVariable int id) {
		
		return service.getEmp(id);
	}
	
	@PostMapping(value="/employee")
	public EmpEntity saveEmp(@RequestBody EmpEntity employee) {
		return service.saveEmp(employee);
	}
	
	@PutMapping(value="/employee")
	public EmpEntity updateEmp(@RequestBody EmpEntity employee) {
		return service.updateEmp(employee);
	}
	@DeleteMapping(value = "/{id}")
	public String deleteEmp(Integer id) {
	  return service.deleteEmp(id);
	}
}
