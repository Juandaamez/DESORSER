package com.example.rest;

import com.example.model.PersonaEntity;
import com.example.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persona/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/listar")
    private ResponseEntity<List<PersonaEntity>> listarTodasPersonas(){
        return ResponseEntity.ok(personaService.getAllPerson());
    }
}
