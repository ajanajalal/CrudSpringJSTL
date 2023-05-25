package com.demo.dao;

import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    //add employee
    @Transactional
    public void addEmployee(Employee emp){
        hibernateTemplate.save(emp);
    }
    //get all employee
    public List<Employee> getAllEmp(){
        return hibernateTemplate.loadAll(Employee.class);
    }

    //get employee by id
    public Employee getEmployeeById(Long id){
        return hibernateTemplate.get(Employee.class,id);
    }

    //update Employee
    @Transactional
    public void updateEmp(Employee emp){
        hibernateTemplate.update(emp);
    }
    //delete employee
    @Transactional
    public void deleteEmp(Long id){
        hibernateTemplate.delete(hibernateTemplate.load(Employee.class,id));
    }

}
