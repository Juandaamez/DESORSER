package com.usta.taller05.service;

import com.usta.taller05.model.PacientesEntity;
import com.usta.taller05.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientesService {

    @Autowired
   private PacientesRepository pacientesRepository;

    public PacientesEntity create(PacientesEntity pacientes){
        return pacientesRepository.save(pacientes);
    }

    public List<PacientesEntity> getAllPacientes(){
        return pacientesRepository.findAll();
    }

    public void delete(PacientesEntity pacientes){
        pacientesRepository.delete(pacientes);
    }

    public Optional<PacientesEntity> findById(Long id){
        return pacientesRepository.findById(id);
    }

    public void deleteById(Long id){
        pacientesRepository.deleteById(id);
    }

    public PacientesEntity getPacientesByPass(String username, String pass){
      return pacientesRepository.getPacienteByPass(username, pass);
    }

}
