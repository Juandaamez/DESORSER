package com.service.taller2.service;

import com.service.taller2.model.ProgramaEntity;
import com.service.taller2.repo.ProgramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramaService {

    @Autowired
    private ProgramaRepository programaRepository;

    public List<ProgramaEntity> getAllProgramas(){
        return programaRepository.findAll();
    }

    public Optional<ProgramaEntity> getById(Long id){
        return programaRepository.findById(id);
    }

    public int listarTotalProgramas (){
        return programaRepository.countTotalProgramas();
    }
}
