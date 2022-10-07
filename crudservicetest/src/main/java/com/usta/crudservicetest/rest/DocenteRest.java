package com.usta.crudservicetest.rest;

import com.usta.crudservicetest.model.DocenteEntity;
import com.usta.crudservicetest.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/docente/")
public class DocenteRest {

    @Autowired
    private DocenteService docenteService;

    @GetMapping("/listarDocente")
    private ResponseEntity<List<DocenteEntity>> getAllDocentes(){
        return ResponseEntity.ok(docenteService.getAllDocentes());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<DocenteEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(docenteService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(docenteService.listarTotalDocentes()));
    }

}
