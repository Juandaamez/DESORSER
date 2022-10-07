package com.usta.taller05.rest;

import com.usta.taller05.model.MedicosEntity;
import com.usta.taller05.service.MedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicos/")
public class MedicosRest {

    @Autowired
    private MedicosService medicosService;

    @PostMapping("/crear")
    private ResponseEntity<MedicosEntity> guardar(@RequestBody MedicosEntity medicos){
        MedicosEntity temporal = medicosService.create(medicos);

        try{
            return ResponseEntity.created(new URI("/api/medicos"+ temporal.getId_medico())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<MedicosEntity>> listar(){
        return ResponseEntity.ok(medicosService.getAllMedicos());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarMedicos(@RequestBody MedicosEntity medicos){
        medicosService.delete(medicos);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<MedicosEntity>> listarMedicosById(@PathVariable("id") Long id){
        return ResponseEntity.ok(medicosService.findById(id));
    }

    @GetMapping("/getMedByCat/{categoria}")
    private ResponseEntity<MedicosEntity> getMedicosByCategorias(@PathVariable("categoria") String categoria){
        return ResponseEntity.ok(medicosService.getMedicosByCategorias(categoria));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarMedicosById(@PathVariable ("id") Long id){
        medicosService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<MedicosEntity> editar(@RequestBody MedicosEntity medicos){
        MedicosEntity temporal = medicosService.create(medicos);

        try{
            return ResponseEntity.created(new URI("/api/medicos"+ temporal.getId_medico())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
