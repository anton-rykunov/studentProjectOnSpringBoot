package com.studentprogect.springboot.studentprojectonspringboot.repository;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
