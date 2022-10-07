package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.AsignaturaEntity;
import com.usta.crudservicetest.repo.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<AsignaturaEntity> getAllAsignaturas(){
        return asignaturaRepository.findAll();
    }

    public Optional<AsignaturaEntity> getById(Long id){
        return asignaturaRepository.findById(id);
    }

    public int listarTotalAsignatura (){
        return asignaturaRepository.countTotalAsignaturas();
    }
}
