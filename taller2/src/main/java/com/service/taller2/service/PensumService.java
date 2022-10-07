package com.service.taller2.service;

import com.service.taller2.model.PensumEntity;
import com.service.taller2.repo.PensumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PensumService {

    @Autowired
    private PensumRepository pensumRepository;

    public List<PensumEntity> getAllPensums(){
        return pensumRepository.findAll();
    }

    public Optional<PensumEntity> getById(Long id){
        return pensumRepository.findById(id);
    }

    public int listarTotalPensums (){
        return pensumRepository.countTotalPensums();
    }

    public String getProgramPensum (Long id){
        return pensumRepository.getProgramPensum(id);
    }
}
