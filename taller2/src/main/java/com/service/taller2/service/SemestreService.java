package com.service.taller2.service;

import com.service.taller2.model.SemestreEntity;
import com.service.taller2.repo.SemestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemestreService {

    @Autowired
    private SemestreRepository semestreRepository;

    public List<SemestreEntity> getAllSemestres(){
        return semestreRepository.findAll();
    }

    public Optional<SemestreEntity> getById(Long id){
        return semestreRepository.findById(id);
    }

    public int listarTotalSemestres (){
        return semestreRepository.countTotalSemestres();
    }

    public List<SemestreEntity> listarSemByName (String name){
        return semestreRepository.getSemByName(name);
    }
}
