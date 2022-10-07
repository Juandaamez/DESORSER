package com.usta.tallercrud.rest;

import com.usta.tallercrud.model.FacultadEntity;
import com.usta.tallercrud.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultad/")
public class FacultadRest {

    @Autowired
    private FacultadService facultadService;

    @PostMapping("/crear")
    private ResponseEntity<FacultadEntity> guardar(@RequestBody FacultadEntity facultad){
        FacultadEntity temporal = facultadService.create(facultad);

        try{
            return ResponseEntity.created(new URI("/api/facultad"+ temporal.getId_facultad())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<FacultadEntity>> listar(){
        return ResponseEntity.ok(facultadService.getAllFacultades());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarFacultad(@RequestBody FacultadEntity facultad){
        facultadService.delete(facultad);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<FacultadEntity>> listarFacultadById(@PathVariable("id") Long id){
        return ResponseEntity.ok(facultadService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarFacultadById(@PathVariable ("id") Long id){
        facultadService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<FacultadEntity> editar(@RequestBody FacultadEntity facultad) {
        FacultadEntity temporal = facultadService.create(facultad);

        try {
            return ResponseEntity.created(new URI("/api/facultad" + temporal.getId_facultad())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
