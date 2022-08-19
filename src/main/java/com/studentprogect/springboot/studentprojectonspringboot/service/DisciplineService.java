package com.studentprogect.springboot.studentprojectonspringboot.service;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Discipline;
import com.studentprogect.springboot.studentprojectonspringboot.entity.Term;
import com.studentprogect.springboot.studentprojectonspringboot.repository.DisciplineRepository;
import com.studentprogect.springboot.studentprojectonspringboot.repository.TermRepository;

import java.util.List;

public class DisciplineService {

    private DisciplineRepository disciplineRepository;

    public DisciplineService(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public Discipline findById(int id){
        return disciplineRepository.findById(id).get();
    }

    public List<Discipline> findAll(){
        return disciplineRepository.findAll();
    }

    public Discipline saveTerm(Discipline discipline){
        return disciplineRepository.save(discipline);
    }

    public void deleteById(int id) {
        disciplineRepository.deleteById(id);
    }

}
