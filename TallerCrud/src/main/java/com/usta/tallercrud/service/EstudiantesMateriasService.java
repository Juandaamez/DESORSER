package com.usta.tallercrud.service;

import com.usta.tallercrud.model.EstudiantesEntity;
import com.usta.tallercrud.model.EstudiantesMateriasEntity;
import com.usta.tallercrud.repository.EstudiantesMateriasRepository;
import com.usta.tallercrud.repository.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesMateriasService {

    @Autowired
   private EstudiantesMateriasRepository estudiantesMateriasRepository;

    public EstudiantesMateriasEntity create(EstudiantesMateriasEntity estudiantes_materia){
        return estudiantesMateriasRepository.save(estudiantes_materia);
    }

    public List<EstudiantesMateriasEntity> getAllEstudiantesMaterias(){
        return estudiantesMateriasRepository.findAll();
    }

    public void delete(EstudiantesMateriasEntity estudiantes_materia){
        estudiantesMateriasRepository.delete(estudiantes_materia);
    }

    public Optional<EstudiantesMateriasEntity> findById(Long id){
        return estudiantesMateriasRepository.findById(id);
    }

    public void deleteById(Long id){
        estudiantesMateriasRepository.deleteById(id);
    }
}
