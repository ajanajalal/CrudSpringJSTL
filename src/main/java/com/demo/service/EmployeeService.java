package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    //add employee
    public void addEmp(Employee emp){
        employeeDao.addEmployee(emp);
    }

    //get all employee
    public List<Employee> getAllEmp(){
        return employeeDao.getAllEmp();
    }

    //get emp by id
    public Employee getById(Long id){
        return employeeDao.getEmployeeById(id);
    }
    //update emp
    public void updateEmp(Employee emp){
        employeeDao.updateEmp(emp);
    }

    //delete Employee
    public void deleteEmp(Long id){
        employeeDao.deleteEmp(id);
    }

}
