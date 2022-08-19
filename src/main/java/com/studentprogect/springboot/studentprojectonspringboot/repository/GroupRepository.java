package com.studentprogect.springboot.studentprojectonspringboot.repository;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
