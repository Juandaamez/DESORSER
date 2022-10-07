package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.UniversidadEntity;
import com.usta.crudservicetest.repo.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversidadService {

    @Autowired
    private UniversidadRepository universidadRepository;

    public List<UniversidadEntity> getAllUniversidades() {
        return universidadRepository.findAll();
    }

    public Optional<UniversidadEntity> getById(Long id) {
        return universidadRepository.findById(id);
    }


    public int listarTotalUniversidades() {
        return universidadRepository.countTotalUniversidades();
    }
}
