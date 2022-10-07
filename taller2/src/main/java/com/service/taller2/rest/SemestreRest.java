package com.service.taller2.rest;

import com.service.taller2.model.SemestreEntity;
import com.service.taller2.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/semestre/")
public class SemestreRest {

    @Autowired
    private SemestreService semestreService;

    @GetMapping("/listarSemestres")
    private ResponseEntity<List<SemestreEntity>> getAllSemestres(){
        return ResponseEntity.ok(semestreService.getAllSemestres());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<SemestreEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(semestreService.getById(id));
    }

    @GetMapping("/listarSemByName/{name}")
    private ResponseEntity<List<SemestreEntity>> listarSemByName(@PathVariable("name") String name){
        return ResponseEntity.ok(semestreService.listarSemByName(name));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(semestreService.listarTotalSemestres()));
    }

}
