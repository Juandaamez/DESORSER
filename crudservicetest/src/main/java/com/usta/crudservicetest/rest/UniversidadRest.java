package com.usta.crudservicetest.rest;

import com.usta.crudservicetest.model.UniversidadEntity;
import com.usta.crudservicetest.service.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universidad/")
public class UniversidadRest {

    @Autowired
    private UniversidadService universidadService;

    @GetMapping("/listarUniversidad")
    private ResponseEntity<List<UniversidadEntity>> getAllUniversidades(){
        return ResponseEntity.ok(universidadService.getAllUniversidades());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<UniversidadEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(universidadService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(universidadService.listarTotalUniversidades()));
    }

}
