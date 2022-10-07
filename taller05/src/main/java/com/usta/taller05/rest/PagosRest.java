package com.usta.taller05.rest;

import com.usta.taller05.model.PagosEntity;
import com.usta.taller05.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pagos/")
public class PagosRest {

    @Autowired
    private PagosService pagosService;

    @PostMapping("/crear")
    private ResponseEntity<PagosEntity> guardar(@RequestBody PagosEntity pagos){
        PagosEntity temporal = pagosService.create(pagos);

        try{
            return ResponseEntity.created(new URI("/api/pagos"+ temporal.getId_pago())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<PagosEntity>> listar(){
        return ResponseEntity.ok(pagosService.getAllPagos());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarPagos(@RequestBody PagosEntity pagos){
        pagosService.delete(pagos);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<PagosEntity>> listarPagosById(@PathVariable("id") Long id){
        return ResponseEntity.ok(pagosService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarPagosById(@PathVariable ("id") Long id){
        pagosService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<PagosEntity> editar(@RequestBody PagosEntity pagos){
        PagosEntity temporal = pagosService.create(pagos);

        try{
            return ResponseEntity.created(new URI("/api/pagos"+ temporal.getId_pago())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
