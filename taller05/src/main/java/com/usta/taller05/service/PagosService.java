package com.usta.taller05.service;

import com.usta.taller05.model.PagosEntity;
import com.usta.taller05.repository.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagosService {

    @Autowired
   private PagosRepository pagosRepository;

    public PagosEntity create(PagosEntity pagos){
        return pagosRepository.save(pagos);
    }

    public List<PagosEntity> getAllPagos(){
        return pagosRepository.findAll();
    }

    public void delete(PagosEntity pagos){
        pagosRepository.delete(pagos);
    }

    public Optional<PagosEntity> findById(Long id){
        return pagosRepository.findById(id);
    }

    public void deleteById(Long id){
        pagosRepository.deleteById(id);
    }
}
