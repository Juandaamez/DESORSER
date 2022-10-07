package com.usta.crudservicetest.rest;

import com.usta.crudservicetest.model.AsignaturaEntity;
import com.usta.crudservicetest.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignatura/")
public class AsignaturaRest {

    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping("/listarAsignatura")
    private ResponseEntity<List<AsignaturaEntity>> getAllAsignaturas(){
        return ResponseEntity.ok(asignaturaService.getAllAsignaturas());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<AsignaturaEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(asignaturaService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(asignaturaService.listarTotalAsignatura()));
    }

}
