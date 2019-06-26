package com.ravi.shoppingcart.repository;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.ravi.shoppingcart.models.Employee;


@Repository("EmployeeRepository")
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
  
  public List<Employee> findByDesignation(String designation);
  
}
