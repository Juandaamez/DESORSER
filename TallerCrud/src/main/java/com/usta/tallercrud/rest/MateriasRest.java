package com.usta.tallercrud.rest;

import com.usta.tallercrud.model.MateriasEntity;
import com.usta.tallercrud.service.MateriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materias/")
public class MateriasRest {

    @Autowired
    private MateriasService materiasService;

    @PostMapping("/crear")
    private ResponseEntity<MateriasEntity> guardar(@RequestBody MateriasEntity materias){
        MateriasEntity temporal = materiasService.create(materias);

        try{
            return ResponseEntity.created(new URI("/api/materias"+ temporal.getId_materia())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<MateriasEntity>> listar(){
        return ResponseEntity.ok(materiasService.getAllMaterias());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarMaterias(@RequestBody MateriasEntity materias){
        materiasService.delete(materias);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<MateriasEntity>> listarMateriasById(@PathVariable("id") Long id){
        return ResponseEntity.ok(materiasService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarMateriasById(@PathVariable ("id") Long id){
        materiasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<MateriasEntity> editar(@RequestBody MateriasEntity materias){
        MateriasEntity temporal = materiasService.create(materias);

        try{
            return ResponseEntity.created(new URI("/api/materias"+ temporal.getId_materia())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
