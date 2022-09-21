package com.example.table_employee.springbootpostgresqltable_employee;

import com.example.table_employee.springbootpostgresqltable_employee.Table_Employee;
import com.example.table_employee.springbootpostgresqltable_employee.Table_employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Table_employeeController {
    @Autowired
    Table_employeeService employeeService;

    @GetMapping("/table_employee")
    public List<Table_Employee> getAll(){

    return employeeService.getAll();
    }

    @PostMapping("/table_employee")
    public Table_Employee save(@RequestBody Table_Employee employee){
     return employeeService.save(employee);
   }

   @PutMapping("table_employee")
    public Table_Employee updateBy(@RequestBody Table_Employee employee) {
        return employeeService.updateBy(employee);
   }
   @DeleteMapping("/table_employee/{id}")
    public void deleteBy(@PathVariable("id") long id){
        employeeService.deleteBy(id);
    }
    @GetMapping("table_employee/{id}")
    public void getById(@PathVariable("id") long id){
        employeeService.getById(id);
    }


    }
