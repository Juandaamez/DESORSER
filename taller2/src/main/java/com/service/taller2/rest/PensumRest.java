package com.service.taller2.rest;

import com.service.taller2.model.PensumEntity;
import com.service.taller2.service.PensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Pensum/")
public class PensumRest {

    @Autowired
    private PensumService pensumService;

    @GetMapping("/listarPensum")
    private ResponseEntity<List<PensumEntity>> getAllPensums(){
        return ResponseEntity.ok(pensumService.getAllPensums());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<PensumEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(pensumService.getById(id));
    }

    @GetMapping("/getPensumPrograma/{id}")
    private ResponseEntity<String> getByIdProgram(@PathVariable("id") Long id){
        return ResponseEntity.ok(pensumService.getProgramPensum(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(pensumService.listarTotalPensums()));
    }

}
