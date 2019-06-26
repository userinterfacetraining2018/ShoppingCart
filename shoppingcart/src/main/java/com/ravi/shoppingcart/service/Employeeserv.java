package com.ravi.shoppingcart.service;

import java.util.List;
import com.ravi.shoppingcart.models.Employee;


public interface Employeeserv {

	/**
	 * Method to save the collection of employees in the database.
	 * @param employees
	 */
	public void saveEmployee(List<Employee> employees);

	/**
	 * Method to fetch all employees from the database.
	 * @return
	 */
	public Iterable<Employee> findAllEmployees();

	/**
	 * Method to fetch the employee details on the bas is of designation.
	 * @param designation
	 * @return
	 */
	public List<Employee> findByDesignation(String designation);	
}