package com.usta.tallercrud.service;

import com.usta.tallercrud.model.FacultadEntity;
import com.usta.tallercrud.model.MateriasEntity;
import com.usta.tallercrud.repository.FacultadRepository;
import com.usta.tallercrud.repository.MateriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriasService {

    @Autowired
   private MateriasRepository materiasRepository;

    public MateriasEntity create(MateriasEntity materias){
        return materiasRepository.save(materias);
    }

    public List<MateriasEntity> getAllMaterias(){
        return materiasRepository.findAll();
    }

    public void delete(MateriasEntity materias){
        materiasRepository.delete(materias);
    }

    public Optional<MateriasEntity> findById(Long id){
        return materiasRepository.findById(id);
    }

    public void deleteById(Long id){
        materiasRepository.deleteById(id);
    }
}
