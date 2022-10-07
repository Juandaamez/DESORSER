package com.usta.taller05.rest;

import com.usta.taller05.model.CitasEntity;
import com.usta.taller05.service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/citas/")
public class CitasRest {

    @Autowired
    private CitasService citasService;

    @PostMapping("/crear")
    private ResponseEntity<CitasEntity> guardar(@RequestBody CitasEntity citas){
        CitasEntity temporal = citasService.create(citas);

        try{
            return ResponseEntity.created(new URI("/api/citas"+ temporal.getId_cita())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<CitasEntity>> listar(){
        return ResponseEntity.ok(citasService.getAllCitas());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarCitas(@RequestBody CitasEntity citas){
        citasService.delete(citas);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<CitasEntity>> listarCitasById(@PathVariable("id") Long id){
        return ResponseEntity.ok(citasService.findById(id));
    }

    @GetMapping("/getCitaByMedico/{nombre}/{numero}")
    private ResponseEntity<String> getCitaByMedico(@PathVariable("nombre") String nombre, @PathVariable("numero") String numero){
        return ResponseEntity.ok(citasService.getCitaByMedico(nombre, numero));
    }

    @GetMapping("/getCitaByPaciente/{nombre}")
    private ResponseEntity<String> listarCitasById(@PathVariable("nombre") String nombre){
        return ResponseEntity.ok(citasService.getCitaByPaciente(nombre));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarCitasById(@PathVariable ("id") Long id){
        citasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<CitasEntity> editar(@RequestBody CitasEntity citas){
        CitasEntity temporal = citasService.create(citas);

        try{
            return ResponseEntity.created(new URI("/api/citas"+ temporal.getId_cita())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
