package com.example.rest;

import com.example.model.EmpresaEntity;
import com.example.model.PersonaEntity;
import com.example.service.EmpresaService;
import com.example.service.PersonaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empresa/")
public class EmpresaRest {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/listarEmpresa")
    private ResponseEntity<List<EmpresaEntity>> getAllEmpresas(){
        return ResponseEntity.ok(empresaService.getAllEmpresas());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<EmpresaEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(empresaService.getById(id));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(empresaService.getAllEmpresas()));
    }

}