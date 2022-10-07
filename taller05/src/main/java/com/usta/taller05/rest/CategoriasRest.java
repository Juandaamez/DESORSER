package com.usta.taller05.rest;

import com.usta.taller05.model.CategoriasEntity;
import com.usta.taller05.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias/")
public class CategoriasRest {

    @Autowired
    private CategoriasService categoriasService;

    @PostMapping("/crear")
    private ResponseEntity<CategoriasEntity> guardar(@RequestBody CategoriasEntity categorias){
        CategoriasEntity temporal = categoriasService.create(categorias);

        try{
            return ResponseEntity.created(new URI("/api/categorias"+ temporal.getId_categoria())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<CategoriasEntity>> listar(){
        return ResponseEntity.ok(categoriasService.getAllCategorias());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarDocumento(@RequestBody CategoriasEntity categorias){
        categoriasService.delete(categorias);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<CategoriasEntity>> listarCategoriasById(@PathVariable("id") Long id){
        return ResponseEntity.ok(categoriasService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarCategoriasById(@PathVariable ("id") Long id){
        categoriasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<CategoriasEntity> editar(@RequestBody CategoriasEntity categorias){
        CategoriasEntity temporal = categoriasService.create(categorias);

        try{
            return ResponseEntity.created(new URI("/api/categorias"+ temporal.getId_categoria())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
