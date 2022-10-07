package com.usta.taller05.service;

import com.usta.taller05.model.MedicosEntity;
import com.usta.taller05.repository.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicosService {

    @Autowired
   private MedicosRepository medicosRepository;

    public MedicosEntity create(MedicosEntity medicos){
        return medicosRepository.save(medicos);
    }

    public List<MedicosEntity> getAllMedicos(){
        return medicosRepository.findAll();
    }

    public void delete(MedicosEntity medicos){
        medicosRepository.delete(medicos);
    }

    public Optional<MedicosEntity> findById(Long id){
        return medicosRepository.findById(id);
    }

    public void deleteById(Long id){
        medicosRepository.deleteById(id);
    }

    public MedicosEntity getMedicosByCategorias(String categorias){
        return medicosRepository.getMedicosByCategoria(categorias);
    }
}
