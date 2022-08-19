package com.studentprogect.springboot.studentprojectonspringboot.repository;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
