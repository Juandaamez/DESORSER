package com.usta.taller04.service;

import com.usta.taller04.model.SocioEntity;
import com.usta.taller04.repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocioService {

    @Autowired
   private SocioRepository socioRepository;

    public SocioEntity create(SocioEntity socio){
        return socioRepository.save(socio);
    }

    public List<SocioEntity> getAllSocios(){
        return socioRepository.findAll();
    }

    public void delete(SocioEntity socio){
        socioRepository.delete(socio);
    }

    public Optional<SocioEntity> findById(Long id){
        return socioRepository.findById(id);
    }

    public void deleteById(Long id){
        socioRepository.deleteById(id);
    }
}
