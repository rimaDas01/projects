package com.mytimesheet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mytimesheet.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query ("select Count(i) from Employee i")
	Integer findAllEmployeeCount();
	
	@Query("select e from Employee e where e.employeeId=:id")
	List<Employee> findById (int id);
	
	@Query("select e from Employee e where e.designation=:designation")
	List<Employee> findByDesignation (String designation);

	@Query("select e.firstName, p.projectName from Employee e INNER JOIN e.projectDetails as p")
	List < Object[] > getDetailsByInnerJoin();
	
	 @Query("select e.firstName, p.projectName, p.projectStatus from Employee e LEFT JOIN e.projectDetails as p where p.projectStatus=:status")
     List <Object[]> getEmpProjectByLeftJoin(String status);
     
     @Query("select e.firstName, p.projectName, t.overtime from Employee e INNER JOIN e.projectDetails as p INNER JOIN e.timesheet as t where e.employeeId =:id")
     Object[] joinEmpProjectTimesheet(Integer id);   
     
       
}
