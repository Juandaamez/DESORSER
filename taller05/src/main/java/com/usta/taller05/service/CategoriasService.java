package com.usta.taller05.service;

import com.usta.taller05.model.CategoriasEntity;
import com.usta.taller05.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasService {

    @Autowired
   private CategoriasRepository categoriasRepository;

    public CategoriasEntity create(CategoriasEntity categorias){
        return categoriasRepository.save(categorias);
    }

    public List<CategoriasEntity> getAllCategorias(){
        return categoriasRepository.findAll();
    }

    public void delete(CategoriasEntity categorias){
        categoriasRepository.delete(categorias);
    }

    public Optional<CategoriasEntity> findById(Long id){
        return categoriasRepository.findById(id);
    }

    public void deleteById(Long id){
        categoriasRepository.deleteById(id);
    }
}
