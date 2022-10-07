package com.service.taller2.rest;

import com.service.taller2.model.ProgramaEntity;
import com.service.taller2.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/programa/")
public class ProgramaRest {

    @Autowired
    private ProgramaService programaService;

    @GetMapping("/listarProgramas")
    private ResponseEntity<List<ProgramaEntity>> getAllProgramas(){
        return ResponseEntity.ok(programaService.getAllProgramas());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<ProgramaEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(programaService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(programaService.listarTotalProgramas()));
    }

}
