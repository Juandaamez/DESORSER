package com.usta.crudservicetest.rest;

import com.usta.crudservicetest.model.SeccionalEntity;
import com.usta.crudservicetest.service.SeccionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seccional/")
public class SeccionalRest {

    @Autowired
    private SeccionalService seccionalService;

    @GetMapping("/listarSeccional")
    private ResponseEntity<List<SeccionalEntity>> getAllSeccionales(){
        return ResponseEntity.ok(seccionalService.getAllSeccionales());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<SeccionalEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(seccionalService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(seccionalService.listarTotalSeccionales()));
    }

}
