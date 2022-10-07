package com.service.taller2.service;

import com.service.taller2.model.MateriaEntity;
import com.service.taller2.repo.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public List<MateriaEntity> getAllMaterias(){
        return materiaRepository.findAll();
    }

    public Optional<MateriaEntity> getById(Long id){
        return materiaRepository.findById(id);
    }

    public int listarTotalMaterias (){
        return materiaRepository.countTotalMaterias();
    }

    public MateriaEntity listarMateriasByName (String name){
        return materiaRepository.getMateriaByName(name);
    }
}
