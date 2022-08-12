package com.example.service;


import com.example.model.PersonaEntity;
import com.example.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<PersonaEntity> getAllPerson(){
        return personaRepository.findAll();
    }
}
