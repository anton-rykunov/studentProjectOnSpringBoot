package com.studentprogect.springboot.studentprojectonspringboot.controller;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Group;
import com.studentprogect.springboot.studentprojectonspringboot.entity.Student;
import com.studentprogect.springboot.studentprojectonspringboot.service.GroupService;
import com.studentprogect.springboot.studentprojectonspringboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GroupController {

    private final GroupService groupService;
    private final StudentService studentService;

    public GroupController(GroupService groupService, StudentService studentService) {
        this.groupService = groupService;
        this.studentService = studentService;
    }
    @GetMapping("/group")
    public String getAllGroup(Model model){
        List<Group> allGroups = groupService.findAll();
        model.addAttribute("groups", allGroups);
        return "all-groups";
    }
    @GetMapping ("compound-group/{id}")
    public String getStudentsByGroupId(@PathVariable("id") Integer id, Model model){
        List<Student> students = groupService.getStudentByGroupId(id);
        model.addAttribute("students", students);
        return "compound-group";
    }
}
