package com.fylyheng.corebanking.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(path = "api-employee",collectionResourceRel = "api-employee")
public interface EmployeeRepository extends MongoRepository<Employee, Long> {


    @RestResource(path = "list-by-id")
    Page<Employee> findAllByEmployeeId(@Param("employeeId") Long employeeId, Pageable pageable);


}
