package com.usta.tallercrud.service;

import com.usta.tallercrud.model.FacultadEntity;
import com.usta.tallercrud.repository.FacultadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadService {

    @Autowired
   private FacultadRepository facultadRepository;

    public FacultadEntity create(FacultadEntity facultad){
        return facultadRepository.save(facultad);
    }

    public List<FacultadEntity> getAllFacultades(){
        return facultadRepository.findAll();
    }

    public void delete(FacultadEntity facultad){
        facultadRepository.delete(facultad);
    }

    public Optional<FacultadEntity> findById(Long id){
        return facultadRepository.findById(id);
    }

    public void deleteById(Long id){
        facultadRepository.deleteById(id);
    }
}
