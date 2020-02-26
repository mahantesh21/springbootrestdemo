package com.springboot.rest.example.springbootrestdemo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	List<Employee> findByName(@Param("name") String name);

	List<Employee> findByDepartment(@Param("department") String department);

	List<Employee> findByEmpId(@Param("empid") String empid);

	// http://localhost:8080/employee/
	// http://localhost:8080/employee/search/findByName?name=Mahant
	// http://localhost:8080/employee/search/findByDepartment?department=IT

}
