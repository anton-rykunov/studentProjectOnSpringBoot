package com.studentprogect.springboot.studentprojectonspringboot.service;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Group;
import com.studentprogect.springboot.studentprojectonspringboot.entity.Student;
import com.studentprogect.springboot.studentprojectonspringboot.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group findById(Integer id){
        return groupRepository.findById(id).get();
    }

    public List<Group> findAll(){
        return groupRepository.findAll();
    }

    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }


    public void deleteById(Integer id) {
        groupRepository.deleteById(id);
    }

    public List<Student> getStudentByGroupId(Integer id){
        return groupRepository.findById(id).get().getStudentsListInGroup();
    }

}
