package com.studentprogect.springboot.studentprojectonspringboot.service;

import com.studentprogect.springboot.studentprojectonspringboot.entity.Discipline;
import com.studentprogect.springboot.studentprojectonspringboot.entity.Term;
import com.studentprogect.springboot.studentprojectonspringboot.repository.TermRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermService {

    private TermRepository termRepository;

    public TermService(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

    public Term findById(int id){
        return termRepository.findById(id).get();
    }

    public List<Term> findAll(){
        return termRepository.findAll();
    }

    public Term saveTerm(Term term){
        return termRepository.save(term);
    }

    public void deleteById(int id) {
        termRepository.deleteById(id);
    }

}
