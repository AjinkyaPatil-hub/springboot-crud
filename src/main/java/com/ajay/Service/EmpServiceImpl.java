package com.ajay.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Dao.EmpRepo;
import com.ajay.entity.EmpEntity;

@Service
public class EmpServiceImpl {

	@Autowired
	EmpRepo dao;
	
	public EmpEntity saveEmp(EmpEntity emp) {
		
			EmpEntity employee = dao.save(emp);
			return employee;
		}
		
	public EmpEntity updateEmp(EmpEntity emp) {

		Optional<EmpEntity> employeeDb = dao.findById(emp.getId());
		if(employeeDb.isPresent()) {
			EmpEntity myemp = employeeDb.get();
			emp.setAddress(myemp.getAddress());
			emp.setGender(myemp.getGender());
			emp.setName(myemp.getName());
			emp.setPincode(myemp.getPincode());
			dao.save(myemp);
			return myemp;	
		}
		else {
			return new EmpEntity();
		}
	}
		
	

	public List<EmpEntity> fetchAllEmp(){
		List<EmpEntity> allEmp = dao.findAll();
		return allEmp;
	
	}
	
	public EmpEntity getEmp(int id) {
		Optional<EmpEntity> employee = dao.findById(id);
		if(employee.isPresent()) {
			EmpEntity e = employee.get();
			return e;
		}
		return null;
	}
		

	
}
