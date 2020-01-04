package com.ajay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.entity.EmpEntity;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Integer>{

}
