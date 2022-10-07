package com.usta.crudservicetest.service;

import com.usta.crudservicetest.model.SeccionalEntity;
import com.usta.crudservicetest.repo.SeccionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeccionalService {

    @Autowired
    private SeccionalRepository seccionalRepository;

    public List<SeccionalEntity> getAllSeccionales(){
        return seccionalRepository.findAll();
    }

    public Optional<SeccionalEntity> getById(Long id){
        return seccionalRepository.findById(id);
    }

    public int listarTotalSeccionales (){
        return seccionalRepository.countTotalSeccionales();
    }
}
