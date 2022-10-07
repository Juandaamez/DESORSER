package com.service.taller2.rest;

import com.service.taller2.model.MateriaEntity;
import com.service.taller2.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Materia/")
public class MateriaRest {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/listarAsignatura")
    private ResponseEntity<List<MateriaEntity>> getAllMaterias(){
        return ResponseEntity.ok(materiaService.getAllMaterias());
    }

    @GetMapping("/listarid/{id}")
    private ResponseEntity<Optional<MateriaEntity>> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(materiaService.getById(id));
    }

    @GetMapping("/getByName/{name}")
    private ResponseEntity<MateriaEntity> getByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(materiaService.listarMateriasByName(name));
    }

    @GetMapping("/listarTotal")
    private ResponseEntity<String> listarTotal(){
        return ResponseEntity.ok("El total es:" + String.valueOf(materiaService.listarTotalMaterias()));
    }

}
