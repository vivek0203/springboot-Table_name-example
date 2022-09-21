package com.example.table_employee.springbootpostgresqltable_employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Table_employeeServiceImpl  implements Table_employeeService {
    @Autowired
    private Table_employeeRepository employeeRepository;


    @Override
    public List<Table_Employee> getAll() {
        return (List<Table_Employee>)employeeRepository.findAll();
    }

    @Override
    public Table_Employee save(Table_Employee employee) {

        return employeeRepository.save(employee) ;
    }

    @Override
    public Table_Employee updateBy(Table_Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteBy(long id) {
       employeeRepository.deleteById(id);
    }

    @Override
    public void getById(long id) {
        employeeRepository.findById(id);
    }
}
