package com.studentprogect.springboot.studentprojectonspringboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "term")
@Data
public class Term {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "duration")
    private String duration;

    @ManyToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "term_discipline", joinColumns = @JoinColumn(name = "id_term"),
    inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> disciplines;
}
