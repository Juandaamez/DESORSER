package com.usta.tallercrud.rest;

import com.usta.tallercrud.model.EstudiantesEntity;
import com.usta.tallercrud.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes/")
public class EstudiantesRest {

    @Autowired
    private EstudiantesService estudiantesService;

    @PostMapping("/crear")
    private ResponseEntity<EstudiantesEntity> guardar(@RequestBody EstudiantesEntity estudiantes){
        EstudiantesEntity temporal = estudiantesService.create(estudiantes);

        try{
            return ResponseEntity.created(new URI("/api/estudiantes"+ temporal.getId_estudiante())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<EstudiantesEntity>> listar(){
        return ResponseEntity.ok(estudiantesService.getAllEstudiantes());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarEstudiante(@RequestBody EstudiantesEntity estudiantes){
        estudiantesService.delete(estudiantes);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<EstudiantesEntity>> listarEstudianteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(estudiantesService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarEstudianteById(@PathVariable ("id") Long id){
        estudiantesService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<EstudiantesEntity> editar(@RequestBody EstudiantesEntity estudiantes){
        EstudiantesEntity temporal = estudiantesService.create(estudiantes);

        try{
            return ResponseEntity.created(new URI("/api/estudiantes"+ temporal.getId_estudiante())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
