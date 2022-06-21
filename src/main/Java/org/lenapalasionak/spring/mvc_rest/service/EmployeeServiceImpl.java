package org.lenapalasionak.spring.mvc_rest.service;

import org.lenapalasionak.spring.mvc_rest.dao.EmployeeDAO;
import org.lenapalasionak.spring.mvc_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;//чтобы достать методы ДАО

    @Override
    @Transactional//будет автоматом открывать и закрывать транзакции
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }


    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);

    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {

        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
