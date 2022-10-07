package com.usta.taller04.rest;

import com.usta.taller04.model.SocioEntity;
import com.usta.taller04.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/socio/")
public class SocioRest {

    @Autowired
    private SocioService socioService;

    @PostMapping("/crear")
    private ResponseEntity<SocioEntity> guardar(@RequestBody SocioEntity socio){
        SocioEntity temporal = socioService.create(socio);

        try{
            return ResponseEntity.created(new URI("/api/socio"+ temporal.getId_socio())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<SocioEntity>> listar(){
        return ResponseEntity.ok(socioService.getAllSocios());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarSocio(@RequestBody SocioEntity socio){
        socioService.delete(socio);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<SocioEntity>> listarEstudianteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(socioService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarSocioById(@PathVariable ("id") Long id){
        socioService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<SocioEntity> editar(@RequestBody SocioEntity socio){
        SocioEntity temporal = socioService.create(socio);

        try{
            return ResponseEntity.created(new URI("/api/socio"+ temporal.getId_socio())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
