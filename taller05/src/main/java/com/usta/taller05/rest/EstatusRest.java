package com.usta.taller05.rest;

import com.usta.taller05.model.EstatusEntity;
import com.usta.taller05.service.EstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estatus/")
public class EstatusRest {

    @Autowired
    private EstatusService estatusService;

    @PostMapping("/crear")
    private ResponseEntity<EstatusEntity> guardar(@RequestBody EstatusEntity estatus){
        EstatusEntity temporal = estatusService.create(estatus);

        try{
            return ResponseEntity.created(new URI("/api/estatus"+ temporal.getId_estatus())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<EstatusEntity>> listar(){
        return ResponseEntity.ok(estatusService.getAllEstatus());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarEstatus(@RequestBody EstatusEntity estatus){
        estatusService.delete(estatus);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<EstatusEntity>> listarEstatusById(@PathVariable("id") Long id){
        return ResponseEntity.ok(estatusService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarEstatusById(@PathVariable ("id") Long id){
        estatusService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<EstatusEntity> editar(@RequestBody EstatusEntity estatus){
        EstatusEntity temporal = estatusService.create(estatus);

        try{
            return ResponseEntity.created(new URI("/api/estatus"+ temporal.getId_estatus())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
