package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.DocenteEntity;
import com.usta.crudservicetest.repo.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<DocenteEntity> getAllDocentes(){
        return docenteRepository.findAll();
    }

    public Optional<DocenteEntity> getById(Long id){
        return docenteRepository.findById(id);
    }

    public int listarTotalDocentes (){
        return docenteRepository.countTotalDocentes();
    }
}
