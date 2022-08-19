package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.EmpresaEntity;
import com.usta.crudservicetest.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<EmpresaEntity> getAllEmpresas(){
        return empresaRepository.findAll();
    }

    public Optional<EmpresaEntity> getById(Long id){
        return empresaRepository.findById(id);
    }
}
