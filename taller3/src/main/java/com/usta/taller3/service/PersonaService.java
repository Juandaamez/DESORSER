package com.usta.taller3.service;

import com.usta.taller3.model.PersonaEntity;
import com.usta.taller3.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
   private PersonaRepository personaRepository;

    public PersonaEntity create(PersonaEntity persona){
        return personaRepository.save(persona);
    }

    public List<PersonaEntity> getAllPersonas(){
        return personaRepository.findAll();
    }

    public void delete(PersonaEntity persona){
        personaRepository.delete(persona);
    }

    public Optional<PersonaEntity> findById(Long id){
        return personaRepository.findById(id);
    }

    public void deleteById(Long id){
        personaRepository.deleteById(id);
    }
}
