package com.usta.tallercrud.service;

import com.usta.tallercrud.model.EstudiantesEntity;
import com.usta.tallercrud.model.MateriasEntity;
import com.usta.tallercrud.repository.EstudiantesRepository;
import com.usta.tallercrud.repository.MateriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesService {

    @Autowired
   private EstudiantesRepository estudiantesRepository;

    public EstudiantesEntity create(EstudiantesEntity estudiantes){
        return estudiantesRepository.save(estudiantes);
    }

    public List<EstudiantesEntity> getAllEstudiantes(){
        return estudiantesRepository.findAll();
    }

    public void delete(EstudiantesEntity estudiantes){
        estudiantesRepository.delete(estudiantes);
    }

    public Optional<EstudiantesEntity> findById(Long id){
        return estudiantesRepository.findById(id);
    }

    public void deleteById(Long id){
        estudiantesRepository.deleteById(id);
    }
}
