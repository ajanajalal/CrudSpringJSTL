package com.demo.controller;

import com.demo.model.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("addStudent")
    public String addStudent(){
        return "AddStudent";
    }
    @PostMapping("insertStudent")
    public String insertStudent(@ModelAttribute("insertStudent") Student student){
        studentService.addStud(student);
        return "redirect:/studentReport";
    }
    @GetMapping("studentReport")
    public String getAllStudent(Model m){
        m.addAttribute("student",studentService.getAllStud());
        m.addAttribute("title","Student Report");
        return "StudentReport";
    }
    @GetMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStud(id);
        return "redirect:/studentReport";
    }
    @GetMapping("editStudent/{id}")
    public String updateStud(@PathVariable Long id,Model m){
        m.addAttribute("student",studentService.getStudById(id));
        m.addAttribute("title","Edit Student");
        return "EditStudent";
    }

    @PostMapping("editStudent/updateStudent")
    public String updateStudent(@ModelAttribute("updateStudent") Student student){
        studentService.updateStud(student);
        return "redirect:/studentReport";
    }
}
