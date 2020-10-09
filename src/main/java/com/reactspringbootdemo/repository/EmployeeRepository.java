package com.reactspringbootdemo.repository;

import com.reactspringbootdemo.modal.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author manish on 09/10/20
 */
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
