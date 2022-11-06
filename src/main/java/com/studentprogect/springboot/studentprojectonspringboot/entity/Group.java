package com.studentprogect.springboot.studentprojectonspringboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "group_students")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "studyGroup", cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Student> studentsListInGroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsListInGroup() {
        return studentsListInGroup;
    }

    public void setStudentsListInGroup(List<Student> studentsListInGroup) {
        this.studentsListInGroup = studentsListInGroup;
    }

    public Group() {
    }

    public Group(String name, List<Student> studentsListInGroup) {
        this.name = name;
        this.studentsListInGroup = studentsListInGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(name, group.name) && Objects.equals(studentsListInGroup, group.studentsListInGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentsListInGroup);
    }

    @Override
    public String toString() {
        return name;
    }
}

