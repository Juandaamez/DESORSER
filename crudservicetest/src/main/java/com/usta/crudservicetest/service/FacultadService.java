package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.FacultadEntity;
import com.usta.crudservicetest.repo.FacultadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadService {

    @Autowired
    private FacultadRepository facultadRepository;

    public List<FacultadEntity> getAllFacultades(){
        return facultadRepository.findAll();
    }

    public Optional<FacultadEntity> getById(Long id){
        return facultadRepository.findById(id);
    }

    public int listarTotalFacultades (){
        return facultadRepository.countTotalFacultades();
    }
}
