package com.usta.taller05.rest;

import com.usta.taller05.model.PacientesEntity;
import com.usta.taller05.service.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pacientes/")
public class PacientesRest {

    @Autowired
    private PacientesService pacientesService;

    @PostMapping("/crear")
    private ResponseEntity<PacientesEntity> guardar(@RequestBody PacientesEntity pacientes){
        PacientesEntity temporal = pacientesService.create(pacientes);

        try{
            return ResponseEntity.created(new URI("/api/pacientes"+ temporal.getId_paciente())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<PacientesEntity>> listar(){
        return ResponseEntity.ok(pacientesService.getAllPacientes());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarPacientes(@RequestBody PacientesEntity pacientes){
        pacientesService.delete(pacientes);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<PacientesEntity>> listarPacientesById(@PathVariable("id") Long id){
        return ResponseEntity.ok(pacientesService.findById(id));
    }

    @GetMapping("/getPacienteByPass/{usuario}/{pass}")
    private ResponseEntity<PacientesEntity> getPacienteByPass(@PathVariable("usuario") String usuario,
                                                              @PathVariable("pass") String pass){
        return ResponseEntity.ok(pacientesService.getPacientesByPass(usuario, pass));
    }



    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarPacientesById(@PathVariable ("id") Long id){
        pacientesService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<PacientesEntity> editar(@RequestBody PacientesEntity pacientes){
        PacientesEntity temporal = pacientesService.create(pacientes);

        try{
            return ResponseEntity.created(new URI("/api/pacientes"+ temporal.getId_paciente())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
