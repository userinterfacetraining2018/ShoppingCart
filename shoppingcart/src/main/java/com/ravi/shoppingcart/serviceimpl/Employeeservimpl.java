package com.ravi.shoppingcart.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ravi.shoppingcart.models.Employee;
import com.ravi.shoppingcart.repository.EmployeeRepository;
import com.ravi.shoppingcart.service.Employeeserv;

@Service("Employeeserv")
public class Employeeservimpl implements Employeeserv {

  @Autowired(required=false)
  private EmployeeRepository edao;

  /* (non-Javadoc)
   * @see com.springboot.elasticsearch.service.Employeeserv#saveEmployee(java.util.List)
   */
  @Override
  public void saveEmployee(List<Employee> employees) {
      edao.saveAll(employees);
  }

  /* (non-Javadoc)
   * @see com.springboot.elasticsearch.service.Employeeserv#findAllEmployees()
   */
  @Override
  public Iterable<Employee> findAllEmployees() {
      return edao.findAll();
  }

  /* (non-Javadoc)
   * @see com.springboot.elasticsearch.service.Employeeserv#findByDesignation(java.lang.String)
   */
  @Override
  public List<Employee> findByDesignation(String designation) {
      return edao.findByDesignation(designation);
  }

}
