package com.usta.taller05.rest;

import com.usta.taller05.model.Citas_PacientesEntity;
import com.usta.taller05.service.Citas_PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/citas_pacientes/")
public class Citas_PacientesRest {

    @Autowired
    private Citas_PacientesService citas_pacientesService;

    @PostMapping("/crear")
    private ResponseEntity<Citas_PacientesEntity> guardar(@RequestBody Citas_PacientesEntity citas_pacientes){
        Citas_PacientesEntity temporal = citas_pacientesService.create(citas_pacientes);

        try{
            return ResponseEntity.created(new URI("/api/citas_pacientes"+ temporal.getId_citas_pacientes())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<Citas_PacientesEntity>> listar(){
        return ResponseEntity.ok(citas_pacientesService.getAllCitas_Pacientes());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarCitas_pacientes(@RequestBody Citas_PacientesEntity citas_pacientes){
        citas_pacientesService.delete(citas_pacientes);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<Citas_PacientesEntity>> listarCitas_PacientesById(@PathVariable("id") Long id){
        return ResponseEntity.ok(citas_pacientesService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarCitas_pacientesById(@PathVariable ("id") Long id){
        citas_pacientesService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<Citas_PacientesEntity> editar(@RequestBody Citas_PacientesEntity citas_pacientes){
        Citas_PacientesEntity temporal = citas_pacientesService.create(citas_pacientes);

        try{
            return ResponseEntity.created(new URI("/api/citas_pacientes"+ temporal.getId_citas_pacientes())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
