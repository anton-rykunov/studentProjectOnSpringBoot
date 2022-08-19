package com.studentprogect.springboot.studentprojectonspringboot.controller;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Group;
import com.studentprogect.springboot.studentprojectonspringboot.entity.Student;
import com.studentprogect.springboot.studentprojectonspringboot.service.GroupService;
import com.studentprogect.springboot.studentprojectonspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;
    private final GroupService groupService;

    public StudentController(StudentService studentService, GroupService groupService) {
        this.studentService = studentService;
        this.groupService = groupService;
    }


    @GetMapping("/students")
    public String findAll(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "all-students";
    }

    @GetMapping("/student-delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteById(id);
        return "redirect:/students";
    }

    @GetMapping("/student-create")
    public String getFormForCreate(Student student, Model model) {
        List<Group> allGroups = groupService.findAll();
        model.addAttribute("groups", allGroups);
        return "student-create_or_update";
    }

    @PostMapping("/student-create")
    public String saveStudent(Student student) {

        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/student-update/{id}")
    public String getUpdateStudentForm(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        List<Group> allGroups = groupService.findAll();
        model.addAttribute("groups", allGroups);
        return "student-create_or_update";
    }

    public String updateStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }


}
