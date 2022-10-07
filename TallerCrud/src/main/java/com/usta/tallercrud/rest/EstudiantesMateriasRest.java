package com.usta.tallercrud.rest;

import com.usta.tallercrud.model.EstudiantesMateriasEntity;
import com.usta.tallercrud.model.MateriasEntity;
import com.usta.tallercrud.service.EstudiantesMateriasService;
import com.usta.tallercrud.service.MateriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes_materias/")
public class EstudiantesMateriasRest {

    @Autowired
    private EstudiantesMateriasService estudiantesMateriasService;

    @PostMapping("/crear")
    private ResponseEntity<EstudiantesMateriasEntity> guardar(@RequestBody EstudiantesMateriasEntity estudiantesMateria){
        EstudiantesMateriasEntity temporal = estudiantesMateriasService.create(estudiantesMateria);

        try{
            return ResponseEntity.created(new URI("/api/estudiantes_materias"+ temporal.getId_estudiante_materias())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<EstudiantesMateriasEntity>> listar(){
        return ResponseEntity.ok(estudiantesMateriasService.getAllEstudiantesMaterias());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarEstudiantesMaterias(@RequestBody EstudiantesMateriasEntity estudiantesMaterias){
        estudiantesMateriasService.delete(estudiantesMaterias);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<EstudiantesMateriasEntity>> listarEstudiantesMateriasById(@PathVariable("id") Long id){
        return ResponseEntity.ok(estudiantesMateriasService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarEstudiantesMateriasById(@PathVariable ("id") Long id){
        estudiantesMateriasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<EstudiantesMateriasEntity> editar(@RequestBody EstudiantesMateriasEntity estudiantesMateria){
        EstudiantesMateriasEntity temporal = estudiantesMateriasService.create(estudiantesMateria);

        try{
            return ResponseEntity.created(new URI("/api/estudiantes_materias"+ temporal.getId_estudiante_materias())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
