package com.studentprogect.springboot.studentprojectonspringboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "discipline")
@Data
public class Discipline {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "discipline")
    private String discipline;
    @ManyToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "term_discipline", joinColumns = @JoinColumn(name ="id_discipline"),
            inverseJoinColumns = @JoinColumn(name = "id_term"))
    private List<Term> terms;
}
