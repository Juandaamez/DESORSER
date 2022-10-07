package com.usta.crudservicetest.rest;

import com.usta.crudservicetest.model.FacultadEntity;
import com.usta.crudservicetest.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultad/")
public class FacultadRest {

    @Autowired
    private FacultadService facultadService;

    @GetMapping("/listarFacultad")
    private ResponseEntity<List<FacultadEntity>> getAllFacultades(){
        return ResponseEntity.ok(facultadService.getAllFacultades());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<FacultadEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(facultadService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(facultadService.listarTotalFacultades()));
    }

}
