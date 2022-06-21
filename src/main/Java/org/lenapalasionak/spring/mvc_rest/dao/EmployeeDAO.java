package org.lenapalasionak.spring.mvc_rest.dao;

import org.lenapalasionak.spring.mvc_rest.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
