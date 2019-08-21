package com.paginator.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paginator.models.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {

	Page<Employees> findAll(Pageable peagable);
	
	List<Employees> findEmployeesByEmpName(String empName,Pageable peagable);
}
