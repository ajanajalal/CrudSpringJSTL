package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public void addStud(Student student){
        studentDao.addStudent(student);
    }

    public List<Student> getAllStud(){
        return studentDao.getAllStudent();
    }

    public Student getStudById(Long id){
        return studentDao.getStudentById(id);
    }

    public void updateStud(Student student){
        studentDao.updateStudent(student);
    }

    public void deleteStud(Long id){
        studentDao.deleteStudent(id);
    }


}
