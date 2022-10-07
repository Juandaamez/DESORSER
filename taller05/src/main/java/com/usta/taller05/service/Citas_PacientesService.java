package com.usta.taller05.service;

import com.usta.taller05.model.Citas_PacientesEntity;
import com.usta.taller05.repository.Citas_PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Citas_PacientesService {

    @Autowired
   private Citas_PacientesRepository citas_pacientesRepository;

    public Citas_PacientesEntity create(Citas_PacientesEntity citas_pacientes){
        return citas_pacientesRepository.save(citas_pacientes);
    }

    public List<Citas_PacientesEntity> getAllCitas_Pacientes(){
        return citas_pacientesRepository.findAll();
    }

    public void delete(Citas_PacientesEntity citas_pacientes){
        citas_pacientesRepository.delete(citas_pacientes);
    }

    public Optional<Citas_PacientesEntity> findById(Long id){
        return citas_pacientesRepository.findById(id);
    }

    public void deleteById(Long id){
        citas_pacientesRepository.deleteById(id);
    }
}
