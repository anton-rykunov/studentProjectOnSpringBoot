package com.studentprogect.springboot.studentprojectonspringboot.entity;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Generated
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "group_id")
    private  Group group;

    @Column(name = "date")
        private Date date;

    @Column(name = "status")
    private int status;
    
}
