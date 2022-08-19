package com.studentprogect.springboot.studentprojectonspringboot.entity;


import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.sql.Date;
import java.time.OffsetDateTime;


@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_group")
    private  Group studyGroup;


    @Column(name = "date")

    private Date date;

//    @Column(name = "status")
//   private int status;

//    public Student() {
//    }
//
//    public Student(String lastname, String name, Group studyGroup, Date date) {
//        this.lastname = lastname;
//        this.name = name;
//        this.studyGroup = studyGroup;
//        this.date = date;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Group getStudyGroup() {
//        return studyGroup;
//    }
//
//    public void setStudyGroup(Group studyGroup) {
//        this.studyGroup = studyGroup;
//    }
}
