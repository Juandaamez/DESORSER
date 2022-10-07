package com.service.taller2.service;

import com.service.taller2.model.MateriaPensumEntity;
import com.service.taller2.repo.MateriaPensumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaPensumService {

    @Autowired
    private MateriaPensumRepository materiaPensumRepository;

    public List<MateriaPensumEntity> getAllMateriaPensum(){
        return materiaPensumRepository.findAll();
    }

    public Optional<MateriaPensumEntity> getById(Long id){
        return materiaPensumRepository.findById(id);
    }

    public int listarTotalMateriaPensum (){
        return materiaPensumRepository.countTotalMateriasPensum();
    }

    public String listarRefName(){
        return materiaPensumRepository.getRefName();
    }

    public String listarRefSemestre(){
        return materiaPensumRepository.getRefSemestre();
    }

    public List<MateriaPensumEntity> listarAllRompimiento(){
        return materiaPensumRepository.getAllRompimiento();
    }

    public String listarNameMatSem(Long id){
        return materiaPensumRepository.getNameMatSem(id);
    }
}
