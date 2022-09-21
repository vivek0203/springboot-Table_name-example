package com.example.table_employee.springbootpostgresqltable_employee;



import java.util.List;

public interface Table_employeeService {

    List<Table_Employee> getAll();

    Table_Employee save(Table_Employee employee);

    Table_Employee updateBy(Table_Employee employee );

    void deleteBy(long id);

    void getById(long id);
}
