package com.usta.taller3.rest;

import com.usta.taller3.model.PersonaEntity;
import com.usta.taller3.repository.PersonaRepository;
import com.usta.taller3.service.PersonaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/crear")
    private ResponseEntity<PersonaEntity> guardar(@RequestBody PersonaEntity persona){
        PersonaEntity temporal = personaService.create(persona);

        try{
            return ResponseEntity.created(new URI("/api/persona"+ temporal.getId_persona())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<PersonaEntity>> listar(){
        return ResponseEntity.ok(personaService.getAllPersonas());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarPersona(@RequestBody PersonaEntity persona){
        personaService.delete(persona);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<PersonaEntity>> listarPersonaById(@PathVariable("id") Long id){
        return ResponseEntity.ok(personaService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarPersonaById(@PathVariable ("id") Long id){
        personaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<PersonaEntity> editar(@RequestBody PersonaEntity persona){
        PersonaEntity temporal = personaService.create(persona);

        try{
            return ResponseEntity.created(new URI("/api/persona"+ temporal.getId_persona())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
