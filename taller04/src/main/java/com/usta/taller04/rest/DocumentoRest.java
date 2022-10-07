package com.usta.taller04.rest;

import com.usta.taller04.model.DocumentoEntity;
import com.usta.taller04.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documento/")
public class DocumentoRest {

    @Autowired
    private DocumentoService documentoService;

    @PostMapping("/crear")
    private ResponseEntity<DocumentoEntity> guardar(@RequestBody DocumentoEntity documento){
        DocumentoEntity temporal = documentoService.create(documento);

        try{
            return ResponseEntity.created(new URI("/api/documento"+ temporal.getId_documento())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/listar")
    private ResponseEntity<List<DocumentoEntity>> listar(){
        return ResponseEntity.ok(documentoService.getAllDocumentos());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> eliminarDocumento(@RequestBody DocumentoEntity documento){
        documentoService.delete(documento);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Optional<DocumentoEntity>> listarDocumentoById(@PathVariable("id") Long id){
        return ResponseEntity.ok(documentoService.findById(id));
    }

    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<Void> eliminarDocumentoById(@PathVariable ("id") Long id){
        documentoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/editar")
    private ResponseEntity<DocumentoEntity> editar(@RequestBody DocumentoEntity documento){
        DocumentoEntity temporal = documentoService.create(documento);

        try{
            return ResponseEntity.created(new URI("/api/documento"+ temporal.getId_documento())).body(temporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
