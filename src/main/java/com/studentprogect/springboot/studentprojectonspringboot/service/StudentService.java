package com.studentprogect.springboot.studentprojectonspringboot.service;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Student;
import com.studentprogect.springboot.studentprojectonspringboot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService{

    private  StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student findById(Integer id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }


    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
