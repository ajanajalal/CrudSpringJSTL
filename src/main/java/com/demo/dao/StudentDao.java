package com.demo.dao;

import com.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class StudentDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public void addStudent(Student student){
        hibernateTemplate.save(student);
    }

    public List<Student> getAllStudent(){
        return hibernateTemplate.loadAll(Student.class);
    }

    public Student getStudentById(Long id){
        return hibernateTemplate.get(Student.class,id);
    }

    @Transactional
    public void updateStudent(Student student){
        hibernateTemplate.update(student);
    }

    @Transactional
    public void deleteStudent(Long id){
        hibernateTemplate.delete(hibernateTemplate.load(Student.class,id));
    }


}
