package com.service.taller2.rest;

import com.service.taller2.model.MateriaPensumEntity;
import com.service.taller2.service.MateriaPensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/MateriaPensum/")
public class MateriaPensumRest {

    @Autowired
    private MateriaPensumService materiaPensumService;

    @GetMapping("/listarMateriaPensum")
    private ResponseEntity<List<MateriaPensumEntity>> getAllMateriaPensum(){
        return ResponseEntity.ok(materiaPensumService.getAllMateriaPensum());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<MateriaPensumEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(materiaPensumService.getById(id));
    }

    @GetMapping("/listarRefName")
    private ResponseEntity<String> listarRefName(){
        return ResponseEntity.ok(materiaPensumService.listarRefName());
    }

    @GetMapping("/listarRefSemestre")
    private ResponseEntity<String> listarRefSemestre(){
        return ResponseEntity.ok(materiaPensumService.listarRefSemestre());
    }

    @GetMapping("/listarAllRompimiento")
    private ResponseEntity<List<MateriaPensumEntity>> listarAllRompimiento(){
        return ResponseEntity.ok(materiaPensumService.listarAllRompimiento());
    }

    @GetMapping("/listarNameMatSem/{id}")
    private ResponseEntity<String> listarNameMatSem(@PathVariable("id") Long id){
        return ResponseEntity.ok(materiaPensumService.listarNameMatSem(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(materiaPensumService.listarTotalMateriaPensum()));
    }

}
