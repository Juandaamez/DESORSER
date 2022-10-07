package com.usta.taller05.rest;

import com.usta.taller05.model.UsuariosEntity;
import com.usta.taller05.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario/")
public class UsuariosRest {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/crear")
    private ResponseEntity<UsuariosEntity> guardar(@RequestBody UsuariosEntity usuarios){
        UsuariosEntity temporal = usuariosService.create(usuarios);

        try{
            return ResponseEntity.created(new URI("/api/usuario"+ temporal.getId_usuario())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<UsuariosEntity>> listar(){
        return ResponseEntity.ok(usuariosService.getAllUsuarios());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarUsuarios(@RequestBody UsuariosEntity usuarios){
        usuariosService.delete(usuarios);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<UsuariosEntity>> listarUsuariosById(@PathVariable("id") Long id){
        return ResponseEntity.ok(usuariosService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarUsuariosById(@PathVariable ("id") Long id){
        usuariosService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<UsuariosEntity> editar(@RequestBody UsuariosEntity usuarios){
        UsuariosEntity temporal = usuariosService.create(usuarios);

        try{
            return ResponseEntity.created(new URI("/api/usuario"+ temporal.getId_usuario())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
