package com.studentprogect.springboot.studentprojectonspringboot.repository;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Term;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermRepository extends JpaRepository<Term, Integer> {
}
