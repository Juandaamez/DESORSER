package com.example.service;


import com.example.model.EmpresaEntity;
import com.example.model.PersonaEntity;
import com.example.repository.EmpresaRepository;
import com.example.repository.PersonaRepository;
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
