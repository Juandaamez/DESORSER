package com.usta.taller04.service;

import com.usta.taller04.model.DocumentoEntity;
import com.usta.taller04.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
   private DocumentoRepository documentoRepository;

    public DocumentoEntity create(DocumentoEntity documento){
        return documentoRepository.save(documento);
    }

    public List<DocumentoEntity> getAllDocumentos(){
        return documentoRepository.findAll();
    }

    public void delete(DocumentoEntity documento){
        documentoRepository.delete(documento);
    }

    public Optional<DocumentoEntity> findById(Long id){
        return documentoRepository.findById(id);
    }

    public void deleteById(Long id){
        documentoRepository.deleteById(id);
    }
}
